import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'




function App() {

  // const [Counter,setCounter]= useState(15);
  let [Counter,setCounter]= useState(15);



  // let Counter = 5;
  const removeValue = () => {
    // console.log('added value',Math.random());
    console.log('Clicked',Math.random());
    console.log('Clicked',Counter);
    // Counter = Counter - 1;
    // setCounter(Counter);
    setCounter(Counter - 1);
    }

  const addValue = () => {
  // console.log('added value',Math.random());
  console.log('Clicked',Math.random());
  console.log('Clicked',Counter);
  // Counter = Counter + 1;
  // setCounter(Counter);
  setCounter(Counter + 1);
  }

  return (
    <>
    <h1>Shail's Start</h1>
    <h2>Counter value : {Counter}</h2>

    <button
    onClick={addValue}
    >add value {Counter}</button>
    <br/>
    <button
    onClick={removeValue}
    >remove value {Counter}</button>
    <p>footer {Counter}</p>
    </>
  )
}

export default App
