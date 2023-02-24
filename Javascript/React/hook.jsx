// 20. How would you develop a custom hook that exposes methods to save
// and modify a counter? The hook must have a parameter that allows the
// developer to specify how much the counter should add for each call to the
// setter.

import { useState } from 'react';

function useCounter(initialValue, step) {
  const [count, setCount] = useState(initialValue);

  const increment = () => setCount(count + step);

  const decrement = () => setCount(count - step);

  const reset = () => setCount(initialValue);

  return { count, increment, decrement, reset };
}
// de esta menera lo aplicamos

import useCounter from './useCounter';

function Counter() {
  const { count, increment, decrement, reset } = useCounter(0, 5);

  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <button onClick={reset}>Reset</button>
    </div>
  );
}