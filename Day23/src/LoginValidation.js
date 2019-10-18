import React, { Component } from 'react'
import './LoginValidation.css'

export default class LoginValidation extends Component {

    constructor(props) {
        super(props)
        this.state = ({
            fullName: '',
            errors: {
                fullName: ''
            }
        })
    }

    doValidation = (e) => {
        e.preventDefault()
        const { name, value } = e.target;
        let errors = this.state.errors;
        switch (name) {
            case 'fullName':
                errors.fullName = value.length < 3 ? 'Full Name must be of atleast three characters' : ''
                break;
            case 'password':
                errors.password = value.length < 6 ? 'Password must be atleast six characters' : ''
                break;
            default:
                break;
        }
        this.setState({
            errors, [name]: value
        })
    }

    render() {
        return (
            <div className='wrapper'>
                <div className='form-wrapper'>
                    <h2>Enter Details</h2>
                    <form onSubmit={this.doValidation}>
                        <div className='fullName'>
                            <label htmlFor="fullName">Full Name</label>
                            <input type="text" name='fullName' onChange={this.doValidation} />
                            <span className='error'>{this.state.errors.fullName}</span>
                            <div className='password'>
                                <label htmlFor="password">Password</label>
                                <input type="password" name='password' onChange={this.doValidation} />
                                <span className='error'>{this.state.errors.password}</span>
                            </div>
                        </div>
                        <div className='submit'>
                            <input type="submit" />
                        </div>
                    </form>
                </div>
            </div>
        )
    }
}
