import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Card from './components/card.jsx'

function App() {
  const [count, setCount] = useState(0)

  let myobj = {
    username: "shail",
    age: 26
  }

  return (
    <>
    <h1 className="text-3xl font-bold underline mb-4">
      Hello world!
    </h1>
    <h1 className='bg-green-400 text-black p-4 rounded-xl mb-4'>Test</h1>
    <Card channel="shail" someobj={myobj}/>
    <Card/>
    </>
  )
}

export default App
