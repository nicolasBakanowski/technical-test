
function userList(props) {
  const { users } = props;

  return (
    <ul>
      {names.map((name, index) => (
        <li key={index}>
          {name.firstname} {name.lastname} - DNI: {name.dni}
        </li>
      ))}
    </ul>
  );
}


