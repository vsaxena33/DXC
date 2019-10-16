import React from 'react';
import ReactDOM from 'react-dom';
// import './index.css';
// import App from './App';
// import * as serviceWorker from './serviceWorker';

// ReactDOM.render(<App />, document.getElementById('root'));

// // If you want your app to work offline and load faster, you can change
// // unregister() to register() below. Note this comes with some pitfalls.
// // Learn more about service workers: https://bit.ly/CRA-PWA
// serviceWorker.unregister();
function Clock(props){
    return(
        <div>
            <h1>Real Time Clock Demo using React</h1>
            <h2>It is {props.date.toLocaleTimeString()}.</h2>
        </div>
    );
}
function display(){
    ReactDOM.render(
        <div>
            <Clock date={new Date()} />
            <Clock date={new Date(2013, 0, 1, 1, 18, 20, 999)} />
        </div>,
        document.getElementById('root')
    )
}
setInterval(display, 1000)