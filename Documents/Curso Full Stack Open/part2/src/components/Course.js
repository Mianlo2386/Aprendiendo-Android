const Course = ({course}) => {
    return (
     <>
          <h1>{course.name}</h1>
         <p>
          {course.parts[0].name} {course.parts[0].exercises} <br/> <br/>
          {course.parts[1].name} {course.parts[1].exercises} <br/> <br/>
          {course.parts[2].name} {course.parts[2].exercises} <br/> <br/>
          {course.parts[3].name} {course.parts[3].exercises}
         </p>
     </>
         
    );
  }
  export default Course