Create <- function(n1,n2,n3,n4,n5, NewDirection)
{
	data <- read.csv("D:\\UCL\\COMP2014\\OriginalData.csv")
	data <- data[,-1]	
	week = c(data[,1])
	scoreAppetite = c(data[,2])
	scoreNPstatus = c(data[,3])
	scorePhysicalAppearance = c(data[,4])
	scoreWeightLoss = c(data[,5])
	scoreIntake = c(data[,6])
	
	print("please enter the Appetite score of current week and then press Enter, Normal for 0, Reduced for 3, Minimal for 5")
	for(j in 9:2)
	{
		scoreAppetite[j] <- scoreAppetite[j-1]
	}
	scoreAppetite[1] <- n1
	
	print("please enter the Neurological/Psychological Status score of current week and then press Enter, Fully orientated for 0, Confused for 3, Unconscious for 5")
	for(j in 9:2)
	{
		scoreNPstatus[j] <- scoreNPstatus[j-1]
	}
	scoreNPstatus[1] <- n2

	print("please enter the Physical Appearance score of current week and then press Enter, Appears appropriate weight or overweight for 0, Appears thin for 2, Appears emaciated for 4")
	for(j in 9:2)
	{
		scorePhysicalAppearance[j] <- scorePhysicalAppearance[j-1]
	}
	scorePhysicalAppearance[1] <- n3

	print("please enter the Weight Loss score of current week and then press Enter, No weight loss for 0, Gradual over several months or Unable to score for 2, Rapid over several weeks for 5")
	for(j in 9:2)
	{
		scoreWeightLoss[j] <- scoreWeightLoss[j-1]
	}
	scoreWeightLoss[1] <- n4

	print("please enter the Intake score of current week and then press Enter, Manages most of 3 meals a day or equivalent for 0, otherwise for 3")
	for(j in 9:2)
	{
		scoreIntake[j] <- scoreIntake[j-1]
	}
	scoreIntake[1] <- n5
	
	data[,2] <- c(scoreAppetite)
	data[,3] <- c(scoreNPstatus)
	data[,4] <- c(scorePhysicalAppearance)
	data[,5] <- c(scoreWeightLoss)
	data[,6] <- c(scoreIntake)

	print("Please enter the new direction of the patient data file")
	return(write.csv(data,file="/Users/Home/Downloads/GraphDisplay"))
}



	

PatientNumber <- function(AD)
{
	print("Please enter direction of the patient data file")
	PatientNumber <- AD
}



graph <- function()
{
	plot.new()
	plot.window(xlim=c(9,1),ylim=c(0,5))
	axis(1,at=seq(9,1,length.out=9),labels=c("8 weeks age","7 weeks ago","6 weeks ago","5 weeks ago",
	"4 weeks ago","3 weeks ago","2 weeks ago","1 weeks ago","current week"))
	axis(2)
	title(xlab="week")
	title(ylab="score")
	box()
	for(i in 0:6)
	{
		abline(h=i,col="gray80")
	}
}


Appetite <- function()
{
	png(filename = "~/Desktop/image.png")
	graph()
	data <- read.csv("/Users/Home/Downloads/GraphDisplay/PatientNumber.csv")
	data <- data[,-1]	
	week = c(data[,1])
	scoreAppetite = c(data[,2])
	scoreNPstatus = c(data[,3])
	scorePhysicalAppearance = c(data[,4])
	scoreWeightLoss = c(data[,5])
	scoreIntake = c(data[,6])
	title(main="Appetite")
	points(week,scoreAppetite, col = "blue")
	lines(week,scoreAppetite,col="red")
}


NPstatus <- function()
{
	png(filename = "~/Desktop/image.png")
	graph()
	data <- read.csv("/Users/Home/Downloads/GraphDisplay/PatientNumber.csv")
	data <- data[,-1]	
	week = c(data[,1])
	scoreAppetite = c(data[,2])
	scoreNPstatus = c(data[,3])
	scorePhysicalAppearance = c(data[,4])
	scoreWeightLoss = c(data[,5])
	scoreIntake = c(data[,6])	
	title(main="Neurological/Psychological Status")
	points(week,scoreNPstatus, col = "blue")
	lines(week,scoreNPstatus,col="red")
}

PhysicalAppearance <- function()
{
	png(filename = "~/Desktop/image.png")
	graph()
	data <- read.csv("/Users/Home/Downloads/GraphDisplay/PatientNumber.csv")
	data <- data[,-1]	
	week = c(data[,1])
	scoreAppetite = c(data[,2])
	scoreNPstatus = c(data[,3])
	scorePhysicalAppearance = c(data[,4])
	scoreWeightLoss = c(data[,5])
	scoreIntake = c(data[,6])	
	title(main="Physical Appearance")
	points(week,scorePhysicalAppearance, col = "blue")
	lines(week,scorePhysicalAppearance,col="red")
}

WeightLoss <- function()
{
	png(filename = "~/Desktop/image.png")
	graph()
	data <- read.csv("/Users/Home/Downloads/GraphDisplay/PatientNumber.csv")
	data <- data[,-1]	
	week = c(data[,1])
	scoreAppetite = c(data[,2])
	scoreNPstatus = c(data[,3])
	scorePhysicalAppearance = c(data[,4])
	scoreWeightLoss = c(data[,5])
	scoreIntake = c(data[,6])	
	title(main="Weight Loss")
	points(week,scoreWeightLoss, col = "blue")
	lines(week,scoreWeightLoss,col="red")
}

Intake <- function()
{
	png(filename = "~/Desktop/image.png")
	graph()
	data <- read.csv("/Users/Home/Downloads/GraphDisplay/PatientNumber.csv")
	data <- data[,-1]	
	week = c(data[,1])
	scoreAppetite = c(data[,2])
	scoreNPstatus = c(data[,3])
	scorePhysicalAppearance = c(data[,4])
	scoreWeightLoss = c(data[,5])
	scoreIntake = c(data[,6])	
	title(main="Intake")
	points(week,scoreIntake, col = "blue")
	lines(week,scoreIntake,col="red")
}


TotalScore <- function()
{
	png(filename = "~/Desktop/image.png")
	plot.new()
	plot.window(xlim=c(9,1),ylim=c(0,25))
	axis(1,at=seq(9,1,length.out=9),labels=c("8 weeks age","7 weeks ago","6 weeks ago","5 weeks ago",
	"4 weeks ago","3 weeks ago","2 weeks ago","1 weeks ago","current week"))
	axis(2)
	title(xlab="week")
	title(ylab="score")
	title(main="Total Score")
	box()
	for(i in 0:25)
	{
		abline(h=i,col="gray80")
	}
	data <- read.csv("/Users/Home/Downloads/GraphDisplay/PatientNumber.csv")
	data <- data[,-1]	
	week = c(data[,1])
	scoreAppetite = c(data[,2])
	scoreNPstatus = c(data[,3])
	scorePhysicalAppearance = c(data[,4])
	scoreWeightLoss = c(data[,5])
	scoreIntake = c(data[,6])	
	for(k in 9:1)
	{
		points(k,sum(data[k,])-k,col = "blue")
	}
}
	
	
score <- function(s1,s2,s3,s4,s5)
{
	print("Please enter the direction of the patient data file")
	data <- read.csv(PatientNumber(AD <- readline()))
	data <- data[,-1]	
	week = c(data[,1])
	scoreAppetite = c(data[,2])
	scoreNPstatus = c(data[,3])
	scorePhysicalAppearance = c(data[,4])
	scoreWeightLoss = c(data[,5])
	scoreIntake = c(data[,6])
	
	print("please enter the Appetite score of current week and then press Enter, Normal for 0, Reduced for 3, Minimal for 5")
	for(j in 9:2)
	{
		scoreAppetite[j] <- scoreAppetite[j-1]
	}
	scoreAppetite[1] <- s1

	print("please enter the Neurological/Psychological Status score of current week and then press Enter, Fully orientated for 0, Confused for 3, Unconscious for 5")
	for(j in 9:2)
	{
		scoreNPstatus[j] <- scoreNPstatus[j-1]
	}
	scoreNPstatus[1] <- s2

	print("please enter the Physical Appearance score of current week and then press Enter, Appears appropriate weight or overweight for 0, Appears thin for 2, Appears emaciated for 4")
	for(j in 9:2)
	{
		scorePhysicalAppearance[j] <- scorePhysicalAppearance[j-1]
	}
	scorePhysicalAppearance[1] <- s3

	print("please enter the Weight Loss score of current week and then press Enter, No weight loss for 0, Gradual over several months or Unable to score for 2, Rapid over several weeks for 5")
	for(j in 9:2)
	{
		scoreWeightLoss[j] <- scoreWeightLoss[j-1]
	}
	scoreWeightLoss[1] <- s4

	print("please enter the Intake score of current week and then press Enter, Manages most of 3 meals a day or equivalent for 0, otherwise for 3")
	for(j in 9:2)
	{
		scoreIntake[j] <- scoreIntake[j-1]
	}
	scoreIntake[1] <- s5

	data[,2] <- c(scoreAppetite)
	data[,3] <- c(scoreNPstatus)
	data[,4] <- c(scorePhysicalAppearance)
	data[,5] <- c(scoreWeightLoss)
	data[,6] <- c(scoreIntake)

	return(write.csv(data,file="/User/Home/Documents/COMP2014/PatientNumber.csv"))
}


