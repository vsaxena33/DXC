import React from 'react';
// import logo from './logo.svg';
import './App.css';
import Welcome from './components/Welcome'
import Comment from './components/Comment'
import Like from './components/Like';
import Unlike from './components/Unlike';

function App() {
  return (
    <div className="App">
      <Welcome name="Vaibhav" place="Raipur"></Welcome>
      <Welcome name="Saxena" place="Korba"></Welcome>
      <Comment commentText="Lol"></Comment>
      <Like message="It's nice"></Like>
      <Unlike></Unlike>
    </div>
  );
}

export default App;
