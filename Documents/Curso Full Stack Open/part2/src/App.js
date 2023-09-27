import React, { useState } from 'react';
import Filter from './components/Filter';
import PersonForm from './components/PersonForm';
import Persons from './components/Persons';

const App = () => {
  const [persons, setPersons] = useState([
    { name: 'Arto Hellas', number: '040-123456' },
    { name: 'Ada Lovelace', number: '39-44-5323523' },
    { name: 'Dan Abramov', number: '12-43-234345' },
    { name: 'Mary Poppendieck', number: '39-23-6423122' },
  ]);
  const [newName, setNewName] = useState('');
  const [newNumber, setNewNumber] = useState('');
  const [searchTerm, setSearchTerm] = useState('');

  const addPerson = (event) => {
    event.preventDefault();

    if (persons.some((person) => person.name === newName)) {
      alert(`${newName} already exists in the phonebook.`);
    } else {
      const personObject = {
        name: newName,
        number: newNumber,
      };
      setPersons([...persons, personObject]);
      setNewName('');
      setNewNumber('');
    }
  };

  const handleNameChange = (event) => {
    setNewName(event.target.value);
  };

  const handleNumberChange = (event) => {
    setNewNumber(event.target.value);
  };

  const handleSearchChange = (event) => {
    setSearchTerm(event.target.value);
  };

  const personsToShow = searchTerm
    ? persons.filter((person) =>
        person.name.toLowerCase().includes(searchTerm.toLowerCase())
      )
    : persons;

    return (
      <div>
        <h2>Phonebook</h2>
  
        <Filter searchTerm={searchTerm} handleSearchChange={handleSearchChange} />
  
        <h3>Add a new</h3>
  
        <PersonForm
          newName={newName}
          newNumber={newNumber}
          handleNameChange={handleNameChange}
          handleNumberChange={handleNumberChange}
          addPerson={addPerson}
        />
  
        <h3>Numbers</h3>
  
        <Persons personsToShow={personsToShow} />
      </div>
    );
};

export default App;







/* import React, { useState } from 'react'
import Note from './components/Note'


const App = (props) => {
  const [notes, setNotes] = useState(props.notes)
  const [newNote, setNewNote] = useState(    'a new note...'  ) 
  const [showAll, setShowAll] = useState(true)

  const addNote = (event) => {
    event.preventDefault()
    const noteObject = {
      content: newNote,
      date: new Date().toISOString(),
      important: Math.random() < 0.5,
      id: notes.length + 1,
    }
  
    setNotes(notes.concat(noteObject))
    setNewNote('')
  }
  const handleNoteChange = (event) => {  
      console.log(event.target.value) 
      setNewNote(event.target.value) 
  }

  const notesToShow = showAll    
  ? notes    
  : notes.filter(note => note.important === true)

  return (
    <div>
      <h1>Notes</h1>
      <div>       
         <button onClick={() => setShowAll(!showAll)}>  
            show {showAll ? 'important' : 'all' } 
         </button>  
      </div>
      <ul>
        {notesToShow.map(note =>
          <Note key={note.id} note={note} />
        )}
      </ul>

      <form onSubmit={addNote}>
        <input 
          value={newNote} 
          onChange={handleNoteChange} 
        />
        <button type="submit">save</button>      
      </form>   
    </div>
  )
}

export default App  */

/* import React from "react";
import Course from "./components/Course";

const App = () => {
  const courses = [
    {
      name: 'Half Stack application development',
      id: 1,
      parts: [
        {
          name: 'Fundamentals of React',
          exercises: 10,
          id: 1,
        },
        {
          name: 'Using props to pass data',
          exercises: 7,
          id: 2,
        },
        {
          name: 'State of a component',
          exercises: 14,
          id: 3,
        },
        {
          name: 'Redux',
          exercises: 11,
          id: 4,
        },
      ],
    },
    {
      name: 'Node.js',
      id: 2,
      parts: [
        {
          name: 'Routing',
          exercises: 3,
          id: 1,
        },
        {
          name: 'Middlewares',
          exercises: 7,
          id: 2,
        },
      ],
    },
  ];

  return (
    <div>
      {courses.map((course) => (
        <Course key={course.id} course={course} />
      ))}
    </div>
  );
};

export default App;
 */