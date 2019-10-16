import React, { Component } from 'react'

export default class VisitorCount extends Component {
    constructor(props){
        super(props)
        this.state = ({
            numberOfUsers: 0
        })
    }
    incrementUser(){
        this.setState(prevState =>({
        //     numberOfUsers: this.state.numberOfUsers + 1
        // },() => {console.log("### sync clicking of the button:" + this.state.numberOfUsers)})
         numberOfUsers: prevState.numberOfUsers + 1
        }),() => {console.log("### sync clicking of the button:" + this.state.numberOfUsers)})
        console.log(this.state.numberOfUsers)
    }
    incrementUserThree(){
        this.incrementUser()
        this.incrementUser()
        this.incrementUser()
    }
    render() {
        console.log("Render method called")
        return (
            <div>
                Number of Vistor: {this.state.numberOfUsers}
                <button onClick={() => this.incrementUserThree()}>Go</button>
            </div>
        );
    }
}
