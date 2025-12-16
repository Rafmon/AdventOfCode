package main

import (
	"fmt"
	"log"
	"os"
	"strconv"
	"strings"
)

// solution for https://adventofcode.com/2025/day/2

func main() {
	var invalidIDSum, invalidIDSumPt2 int64

	data, err := os.ReadFile("Day2_Input.txt")

	if err != nil {
		panic(err)
	}

	line := strings.TrimSpace(string(data))
	idRanges := strings.Split(line, ",")

	for _, idRange := range idRanges {
		idRange = strings.TrimSpace(idRange)

		idRangeStartStr, idRangeEndStr, ok := strings.Cut(idRange, "-")
		if !ok {
			log.Fatalf("invalid range: %q", idRange)
		}

		idRangeStart, err := strconv.ParseInt(strings.TrimSpace(idRangeStartStr), 10, 64)
		if err != nil {
			log.Fatal(err)
		}
		idRangeEnd, err := strconv.ParseInt(strings.TrimSpace(idRangeEndStr), 10, 64)
		if err != nil {
			log.Fatal(err)
		}

		for id := idRangeStart; id <= idRangeEnd; id++ {

			idString := strconv.FormatInt(id, 10)
			length := len(idString)

			if length%2 == 0 {
				mid := length / 2
				if idString[:mid] == idString[mid:] {
					invalidIDSum += id
				}
			}

			// part 2 seperate

			if isRepeated(idString) {
				invalidIDSumPt2 += id
			}
		}

	}
	fmt.Println(invalidIDSum, invalidIDSumPt2)

}

// isRepeated reports whether s consists of a substring repeated at least twice.
func isRepeated(s string) bool {
	n := len(s)

	for blockLength := 1; blockLength <= n/2; blockLength++ {
		if n%blockLength != 0 {
			continue
		}

		block := s[:blockLength]
		repeatFound := true

		for i := blockLength; i < n; i += blockLength {
			if s[i:i+blockLength] != block {
				repeatFound = false
				break
			}
		}
		if repeatFound {
			return true
		}

	}
	return false
}
