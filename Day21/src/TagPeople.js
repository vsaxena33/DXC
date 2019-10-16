import React, {Component} from 'react'

class TagPeople extends Component{
    constructor(){
        super()
        console.log("Tag people cons called")
        this.state = {
            message: "Please Subscribe",
            quotes: "Hello"
        }
    }
    subscribeMe(){
        this.setState({
            message : "Congrats you have subscribed successfully",
            quotes : "How r u today"
        })
    }
    render(){
        console.log("Tag people render called")
        return <div>
            <h1>
                Tag {this.props.friendName} and Annoy them
            </h1>
            <h1>
                Message is: {this.state.message}<br/>
                Quotes is: {this.state.quotes}<br/>
                <button onClick={() => this.subscribeMe()}>subscribe</button>
            </h1>
        </div>
    }
}
export default TagPeople