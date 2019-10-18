import React, { Component } from 'react';
import './LoginValidation.css'

class CompleteFormValidation extends Component {
    render() {
        return (
            <Register />
        );
    }
}
export default CompleteFormValidation

const validEmailRegex = RegExp(/^(([^<>()\[\]\.,;:\s@\"]+(\.[^<>()\[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i);


const validateForm = (errors) => {
    let valid = true;
    Object.values(errors).forEach(
        (val) => val.length > 0 && (valid = false)
    );
    return valid;
}

class Register extends Component {
    constructor(props) {
        super(props);
        this.state = {
            fullName: null,
            email: null,
            password: null,
            mobileNo: null,
            errors: {
                fullName: '',
                email: '',
                password: '',
                mobileNo: '',
            }
        };
    }

    handleChange = (event) => {
        event.preventDefault();
        const { name, value } = event.target;
        let errors = this.state.errors;

        switch (name) {
            case 'fullName':
                errors.fullName =
                    value.length < 5
                        ? 'Full Name must be 5 characters long!'
                        : '';
                break;
            case 'email':
                errors.email =
                    validEmailRegex.test(value)
                        ? ''
                        : 'Email is not valid!';
                break;
            case 'password':
                errors.password =
                    value.length < 8
                        ? 'Password must be 8 characters long!'
                        : '';
                break;
            case 'mobileNo':
                errors.mobileNo =
                    value.length === 10
                        ? ''
                        : 'Invalid Mobile Number'
                break;
            default:
                break;
        }
        this.setState({
            errors, [name]: value
        })

    }

    handleSubmit = (event) => {
        event.preventDefault();
        if (validateForm(this.state.errors)) {
            console.error("Valid Form")
        }
        else {
            console.error("Invalid Form")
        }
    }

    render() {

        return (
            <div className='wrapper'>
                <div className='form-wrapper'>
                    <h2>Create Account</h2>
                    <form onSubmit={this.handleSubmit} noValidate>
                        <div className='fullName'>
                            <label htmlFor="fullName">Full Name</label>
                            <input type='text' name='fullName' onChange={this.handleChange} noValidate />
                            {this.state.errors.fullName.length > 0 &&
                                <span className='error'>{this.state.errors.fullName}</span>}
                        </div>
                        <div className='email'>
                            <label htmlFor="email">Email</label>
                            <input type='email' name='email' onChange={this.handleChange} noValidate />
                            {this.state.errors.email.length > 0 &&
                                <span className='error'>{this.state.errors.email}</span>}
                        </div>
                        <div className='password'>
                            <label htmlFor="password">Password</label>
                            <input type='password' name='password' onChange={this.handleChange} noValidate />
                            {this.state.errors.password.length > 0 &&
                                <span className='error'>{this.state.errors.password}</span>}
                        </div>
                        <div className='info'>
                            <small>Password must be eight characters in length.</small>
                        </div>
                        <div className='mobileNo'>
                            <label htmlFor="mobileNo">Mobile No.</label>
                            <input type='tel' name='mobileNo' onChange={this.handleChange} noValidate />
                            {this.state.errors.mobileNo.length > 0 &&
                                <span className='error'>{this.state.errors.mobileNo}</span>}
                        </div>
                        <div className='submit'>
                            <button>Create</button>
                        </div>
                    </form>
                </div>
            </div>
        );
    }
}
