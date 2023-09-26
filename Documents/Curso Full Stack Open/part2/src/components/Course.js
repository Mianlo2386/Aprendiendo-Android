import React from "react";

const Course = ({ course }) => {
  const totalExercises = course.parts.reduce(
    (total, part) => total + part.exercises,
    0
  );

  return (
    <div>
      <h1>{course.name}</h1>
      {course.parts.map((part) => (
        <p key={part.id}>
          {part.name} {part.exercises}
        </p>
      ))}
      <p>
        <strong>Total of exercises: {totalExercises}</strong>
      </p>
    </div>
  );
};

export default Course;

