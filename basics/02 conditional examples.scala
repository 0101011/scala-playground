var age = 18

val canVote = if(age >= 18) "yes" else "no"

if ((age >=5) && (age <=6)) {
	println("Go to kindergarten")
} else if ((age > 6) && (age <= 7)) {
	println("Go to grade 1")
} else {
	println("Go to grade " + (age - 5))
}

true || false // returns true