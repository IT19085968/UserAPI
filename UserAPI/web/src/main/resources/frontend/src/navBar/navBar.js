import React from 'react';
import './navBar.css'

class Navbar extends React.Component{
    constructor(props){
        super(props);
    }

    render() {
        return (
             <div>

{/* <nav class="navbar navbar-expand-custom navbar-mainbg">
        <a class="navbar-brand navbar-logo" href="#">RNUN</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <i class="fas fa-bars text-white"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto">
                <div class="hori-selector"><div class="left"></div><div class="right"></div></div>
                <li class="nav-item">
                    <a class="nav-link" href="/home"><i class="fas fa-tachometer-alt"></i>Home</a>
                </li>
                <li class="nav-item active">
                    <a className="nav-link" href="/reg-type"><i class="far fa-address-book"></i>Registration</a>
                </li>
                <li class="nav-item">
                    <a className="nav-link" href="javascript:void(0);"><i class="far fa-clone"></i>Components</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="javascript:void(0);"><i class="far fa-calendar-alt"></i>Calendar</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="javascript:void(0);"><i class="far fa-chart-bar"></i>Charts</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="javascript:void(0);"><i class="far fa-copy"></i>Documents</a>
                </li>
            </ul>
        </div>
    </nav> */}
                 <nav className="navbar navbar-expand-lg navbar navbar-light  " >
                <div className="container-fluid">
                  <a className="navbar-brand" href="#">RNUN</a>
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
                      {/* {/* <a className="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>} */}
                    </div>
                  </div>
                </div>
</nav>
             </div>
        );
    }
}

export default Navbar;