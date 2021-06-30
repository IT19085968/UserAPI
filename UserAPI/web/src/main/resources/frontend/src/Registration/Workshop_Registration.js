import React from 'react';
import axios from 'axios';

class Workshop extends React.Component{
    constructor(props){
        super(props);
        
        this.onSubmit=this.onSubmit.bind(this);
        this.state={
            filename:''//awl
        }
    }

    onSubmit(e){
        e.preventDefault();
        let WorkshopProposal={
            workshopProposalId: this.state.filename
        }
    }

    render(){
        return(
            <div>
                <h3>Registration</h3>
                <form onSubmit={this.onSubmit}>
                <div class="mb-3"  >
    <label for="passt" class="form-label">Upload Document</label><br></br>
    <input type="file" id="myFile" class="form-control" name="filename" value={this.state.filename} onChange={this.onChange} />
  </div>


  
  <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
            </div>
        )
    }
}

export default Workshop