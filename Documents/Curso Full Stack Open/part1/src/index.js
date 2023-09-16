import React from 'react';
import { createRoot } from 'react-dom/client';
import Header from './Header';
import Content from './Content';
import Total from './Total';
import Hello from './Hello';
import Counter from './Counter';


const App = () => {
  const course = {
    name: 'Half Stack application development',
    parts: [
      {
        name: 'Fundamentals of React',
        exercises: 10
      },
      {
        name: 'Using props to pass data',
        exercises: 7
      },
      {
        name: 'State of a component',
        exercises: 14
      }
    ]
    
  }
  const name = 'Peter'
  const age = 10

  return (
    <>
      <Header course={course} />
      <Content course={course} />
      <Total course={course} />  
      <h1>Greetings</h1>
        <Hello name="Maya" age={26 + 10} />
        <Hello name={name} age={age} />
        <h1>Contador</h1> 
        <h1>Contador de prueba</h1> 
         
        <Counter/>
      
    </>
  )
}

const container = document.getElementById('root');
const root = createRoot(container);
root.render(<App />);







//VERSION PARA EJERCICIO 3
/* const Header = (props) => {
  return (
    <h1>{props.course}</h1>
  );
} */

/* const Part = (props) => {
  return (
    <p>
      {props.part} {props.exercises}
    </p>
  );
} */

/* const Content = ({parts}) => {
  
   return(
    <p>
      {parts[0].name} {parts[0].exercises} <br /> <br />
      {parts[1].name} {parts[1].exercises} <br /> <br />
      {parts[2].name} {parts[2].exercises}
    </p>
    )

  
}

const Total = ({parts}) => {
  return (
    <p>Number of exercises {parts[0].exercises + parts[1].exercises + parts[2].exercises }</p>
  );
}

const App = () => {
  const course = 'Half Stack application development'
  const parts = [
    {
      name: 'Fundamentals of React',
      exercises: 10
    },
    {
      name: 'Using props to pass data',
      exercises: 7
    },
    {
      name: 'State of a component',
      exercises: 14
    }
  ]

  console.log(parts);
  
  


  return (
    <>
      <Header course={course} />
      <Content parts={parts} />
      <Total parts={parts} />
    </>
  )
} */

//VERSION PARA EJERCICIO 2

/* const App = () => {
  const course = 'Half Stack application development'
  const part1 = {
    name: 'Fundamentals of React',
    exercises: 10
  }
  const part2 = {
    name: 'Using props to pass data',
    exercises: 7
  }
  const part3 = {
    name: 'State of a component',
    exercises: 14
  }

  return (
    <>
       <Header course={course} />
      <Content
        part1={part1.name} exercises1={part1.exercises}
        part2={part2.name} exercises2={part2.exercises}
        part3={part3.name} exercises3={part3.exercises}
      />
      <Total
        exercises1={part1.exercises}
        exercises2={part2.exercises}
        exercises3={part3.exercises}
      />
    </>
  )

} */

  //VERSION PARA EJERCICIO 1
  /* const course = 'Half Stack application development';
  const part1 = 'Fundamentals of React';
  const exercises1 = 10;
  const part2 = 'Using props to pass data';
  const exercises2 = 7;
  const part3 = 'State of a component';
  const exercises3 = 14;

  return (
    <div>
      <Header course={course} />
      <Content
        part1={part1} exercises1={exercises1}
        part2={part2} exercises2={exercises2}
        part3={part3} exercises3={exercises3}
      />
      <Total
        exercises1={exercises1}
        exercises2={exercises2}
        exercises3={exercises3}
      />
    </div>
  ); */



