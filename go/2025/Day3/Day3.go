package main

import (
	"fmt"
	"os"
	"strings"
)

// Solution for https://adventofcode.com/2025/day/3

func main() {
	data, err := os.ReadFile("Day3_Input.txt")

	if err != nil {
		panic(err)
	}

	line := strings.TrimSpace(string(data))
	batteryBanks := strings.Split(line, "\n")

	var joltageSum int
	for _, bank := range batteryBanks {
		joltageSum += maxJoltage(bank)
	}
	fmt.Println(joltageSum)
}

func maxJoltage(bank string) int {
	bank = strings.TrimSpace(bank)

	if len(bank) < 2 {
		return 0
	}

	bankRunes := []rune(bank)
	n := len(bankRunes)
	r1 := bankRunes[n-2]
	r2 := bankRunes[n-1]

	for i := n - 3; i >= 0; i-- {
		ri := bankRunes[i]
		if ri >= r1 {
			if r2 < r1 {
				r2 = r1
			}
			r1 = ri
		}

	}
	return (int(r1-'0')*10 + int(r2-'0'))
}
