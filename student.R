n <- as.integer(readline(prompt = "Enter the no. of students: "))

usn <- vector(mode = "character", length = n)
name <- vector(mode = "character", length = n)
marks <- vector(mode = "numeric", length = n)

for (i in 1:n) {
  usn[i] <- readline("Enter usn: ")
  name[i] <- readline("Enter name: ")
  marks[i] <- as.numeric(readline("Enter marks: "))
}

students <- data.frame(usn, name, marks)
print("Student details: ")
print(students)

age <- vector(mode = "integer", length = n)
for (i in 1:n) {
  age[i] <- as.integer(readline(paste("Enter age for usn", usn[i], ": ")))
}

students <- cbind(students, age)
print("Updated student details: ")
print(students)

students2 <- data.frame()
for (i in 1:n) {
  if (students[i, 3] > 25 && students[i, 4] < 20) {
    students2 <- rbind(students2, students[i, ])
  }
}

print("Students with marks greater than 25 and age less than 20: ")
print(students2)
