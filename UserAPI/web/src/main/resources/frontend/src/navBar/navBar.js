import React from 'react';

class Navbar extends React.Component{
    constructor(props){
        super(props);
    }

    render() {
        return (
             <div>
                 <nav className="navbar navbar-expand-lg navbar navbar-light  " >
                <div className="container-fluid">
                  <a className="navbar-brand" href="#">ICAF</a>
                  <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                  </button>
                  <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div className="navbar-nav">
                      
                      <a className="nav-link" href="/home">Home</a>
                      <a className="nav-link" href="/reg-type">Registration</a>
                      <a className="nav-link" href="/login">Login</a>
                      <a className="nav-link" href="/callForPapers">Call For Papers</a>
                      <a className="nav-link" href="#"></a>
                      {/* <a className="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a> */}
                    </div>
                  </div>
                </div>
</nav>
             </div>
        );
    }
}

export default Navbar;