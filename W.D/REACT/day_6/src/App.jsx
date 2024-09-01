import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [color,setcolor] = useState("olive")

  return (
    <>
    <div className="w-full h- screen duration-200" style={{backgroundColor: color}}>
      <div className='fixed flex flex-warp justify-center bottom-12 inset-x-0 px-2'>
        <div className='flex flex-warp justify-center gap-3 shadow-lgbg-white px-3 py-2 rounded-full'>
          <button className='outline-none px-4' style={{backgroundColor: 'red'}} onClick={()=>setcolor('red')}></button>
        </div>
      </div>
    </div>
    </>
  )
}

export default App
