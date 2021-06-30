package com.userapi.web.AdminAPI;

import com.userapi.web.models.Conference;
import com.userapi.web.models.EditorChanges;
import com.userapi.web.repositories.ConferenceRepository;
import com.userapi.web.repositories.EditorChangesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private final AdminRepository adminRepository;
    @Autowired
    private final EditorChangesRepository editorChangesRepository;
    @Autowired
    private final MongoTemplate mongoTemplate;
    @Autowired
    private final ConferenceRepository conferenceRepository;

    public AdminService(AdminRepository adminRepository, EditorChangesRepository editorChangesRepository, MongoTemplate mongoTemplate, ConferenceRepository conferenceRepository) {
        this.adminRepository = adminRepository;
        this.editorChangesRepository = editorChangesRepository;
        this.mongoTemplate = mongoTemplate;
        this.conferenceRepository = conferenceRepository;
    }

    public void addAdmin(Admin admin){
        adminRepository.save(admin);
    }
    public List<EditorChanges> getAllEditorChanges(){
        return editorChangesRepository.findAll();
    }

    public void approveOrDeclineEdit(EditorChanges editorChanges){
        Optional<EditorChanges> editc = editorChangesRepository.findById(editorChanges.getId());
        if(editorChanges.getApproveOrDeclineEdit()==true){
            Query query =new Query();
            query.addCriteria(Criteria.where("id").is(editorChanges.getId()));
            List<EditorChanges> conferenceEdit = mongoTemplate.find(query, EditorChanges.class);
            if(conferenceEdit.size()>1){
                throw new IllegalStateException("Many Records Found");
            }else{
                EditorChanges editorChange = conferenceEdit.get(0);
                Query queryConference =new Query();
                queryConference.addCriteria(Criteria.where("conferenceName").is(editorChanges.getConferenceName()));
                List<Conference> changeConference = mongoTemplate.find(queryConference,Conference.class);



                if(changeConference.size()>1){
                    throw new IllegalStateException("Many Records Found");
                }
                else{
                    Conference conferenceFinal = changeConference.get(0);
                    conferenceFinal.setConferenceName(editorChanges.getConferenceName());
                    conferenceFinal.setDate(editorChanges.getDate());
                    conferenceFinal.setVenue(editorChanges.getVenue());
                    conferenceFinal.setStartTime(editorChanges.getStartTime());
                    conferenceFinal.setDuration(editorChanges.getDuration());
                    conferenceFinal.setNumberOfAttendees(editorChanges.getNumberOfAttendees());
                    conferenceFinal.setMaximumAttendees(editorChanges.getMaximumAttendees());
                    conferenceRepository.save(conferenceFinal);
                    editorChangesRepository.deleteById(editorChanges.getId());
                }

            }
        }
        else{
            editorChangesRepository.deleteById(editorChanges.getId());
        }
    }
}

