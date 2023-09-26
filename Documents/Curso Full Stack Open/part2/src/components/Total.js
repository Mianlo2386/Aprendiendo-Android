
const Total = ({ course }) => {
  const totalExercises = course.parts
    ? course.parts.reduce((total, part) => total + part.exercises, 0)
    : 0;

  return <p>Number of Exercises {totalExercises}</p>;
};

export default Total


/* const Total = ({course}) => {
    return (
      <p>Number of Exercises  {course.parts[0].exercises + course.parts[1].exercises + course.parts[2].exercises + course.parts[3].exercises}</p>
    )
  }
  export default Total */