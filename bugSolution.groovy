def myMethod(arg1, arg2) {
  if (arg1 == null || arg2 == null) {
    throw new IllegalArgumentException("Arguments cannot be null")
  }
  // ... rest of the method
}

//Improved Null Check using Groovy's safe navigation operator
def myMethodImproved(arg1, arg2) {
  arg1?.someMethod() //safe navigation operator
  arg2?.anotherMethod()
}

myMethodImproved(null, 5) //No exception.  Null values are gracefully handled