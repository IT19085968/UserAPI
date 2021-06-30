import React from 'react';

class RegistrationType extends React.Component{
    constructor(props){
        super(props);
        this.onChange=this.onChange.bind(this);
    }

    onChange(e){
        this.setState({[e.target.name]: e.target.value })
    }

    render(){
        return(
            <div>

<div class="btn-group" role="group" aria-label="Basic radio toggle button group">

<a className="nav-link" href="/ws_presenter">
  <input type="radio"  class="btn-check" name="btnradio"  id="btnradio1" autocomplete="off"
  onChange={e => this.props.history.push('newRoute') || (window.location.href = "/ws_presenter") }/>
  <label class="btn btn-outline-primary" for="btnradio1">Full conference (Presenter)</label>
  </a>
  

  {/* <input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off"/>
  <label class="btn btn-outline-primary" for="btnradio2">Guest</label> */}

  <a className="nav-link" href="/participent">
  <input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off"
  onChange={e => this.props.history.push('newRoute') || (window.location.href = "/participent") }/>
  <label class="btn btn-outline-primary" for="btnradio2">Participant </label>
  </a>

  <a className="nav-link" href="/researcher">
  <input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off"
  onChange={e => this.props.history.push('newRoute') || (window.location.href = "/researcher") }/>
  <label class="btn btn-outline-primary" for="btnradio2">Researcher</label>
  </a>

  <a className="nav-link" href="/workshop">
  <input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off"
  onChange={e => this.props.history.push('newRoute') || (window.location.href = "/workshop") }/>
  <label class="btn btn-outline-primary" for="btnradio2">Workshop Only</label>
  </a>


  <a className="nav-link" href="/other">
  <input type="radio" class="btn-check" name="btnradio" id="btnradio3" autocomplete="off"
  onChange={e => this.props.history.push('newRoute') || (window.location.href = "/other")}/>
  <label class="btn btn-outline-primary" for="btnradio3">Other</label>
  </a>
</div>

            </div>
        )
    }
}

export default RegistrationType