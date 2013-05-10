#!/usr/bin/Rscript
args <- commandArgs(trailingOnly = TRUE)
setwd("/Users/Home/Downloads/GraphDisplay")
source("GraphDisplay.R")

if (args == "appetite") {
	Appetite()
} else if ( args == "npstatus") {
	NPStatus();
} else if (args == "physical") {
	PhysicalAppearance();
} else if (args == "weight") {
	WeightLoss()
} else if (args == "intake") {
	Intake()	
} else {
	TotalScore()
}

