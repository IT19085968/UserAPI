package com.userapi.web.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final WorkshopPresenterRepository workshopPresenterRepository;

    @Autowired
    public UserService(UserRepository userRepository, WorkshopPresenterRepository workshopPresenterRepository) {
        this.userRepository = userRepository;
        this.workshopPresenterRepository = workshopPresenterRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();

    }

    public List<WorkshopPresenter> getAllWorkshopPresenters() {
        return workshopPresenterRepository.findAll();

    }

    public void addNewUser(User user) {

        userRepository.save(user);
    }

    public void addNewWorkshopPresenter(WorkshopPresenter presenter) {

        workshopPresenterRepository.save(presenter);
    }

    public List<WorkshopPresenter> getOneWorkshopPresenter(String id) {
        return workshopPresenterRepository.findByWorkshopProposalId(id);
    }

}