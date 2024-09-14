import { useCallback, useState } from 'react'

import './App.css'

function App() {
  const [count, setCount] = useState(0)


  function App(){
    const[length,setLength] = useState(8)
    const[numerAllowed,setNumberAllowed] = useState(false)
    const[charAllowed,setCharAllowed] = useState(false)
    const[password,setPassword] = useState("")
    const passwordGenerator = useCallback(()=> {
      let pass = ""
      let str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuwxyz"
      if (numerAllowed) {
        str+="0123456789"
      }
      if (charAllowed) {
        str +="!@#$%^&*-_=+(){}[]~`"
      }
      for (let index = 0; index < array.length; index++) {
        const element = array[index];
        
      }
    },[length,numerAllowed,charAllowed,setPassword])
  }
  return (
    <>
    <h1 className = 'text-4xl test-center'>Password genrator</h1>
    </>
  )
}

export default App
