import React, { Component } from 'react'

export default class UserForm extends Component {
    constructor(props) {
        super(props);
        this.state = { value: 'Name here?', msg: '' };
        this.handleChange = this.handleChange.bind(this);
        this.takeInputData = this.takeInputData.bind(this);
    }

    handleChange(ourData) {
        this.setState({ value: ourData.target.value });
    }

    takeInputData(ourData) {
        // alert('A name was submitted ' + this.state.value);
        this.setState({ msg: 'Welcome ' + this.state.value });
        ourData.preventDefault();
    }

    render() {
        return (
            <div>
                <form onsubmit={this.takeInputData}>
                    <label>
                        Name: <input type='text' value={this.state.value} onChange={this.handleChange} />
                    </label>
                    <button onClick={this.takeInputData}>CLICK</button>
                    <input type='submit' value='Submit' />
                    {this.state.msg}
                </form>
            </div>
        );
    }
}
