def myMethod(arg1, arg2) {
  if (arg1 == null || arg2 == null) {
    throw new IllegalArgumentException("Arguments cannot be null")
  }
  // ... rest of the method
}

myMethod(null, 5)