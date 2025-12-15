package main

import (
	"os"
	"path/filepath"
	"strconv"
	"strings"
)

func main() {
	data, err := os.ReadFile(filepath.Join("res", "Day2_Input.txt"))
	var invalid_id_sum int64 = 0
	if err != nil {
		panic(err)
	}

	line := strings.TrimSpace(string(data))       // remove
	id_ranges := strings.Split(string(line), ",") //seperate the id ranges

	for _, id_range := range id_ranges {

		id_range_split := strings.Split(id_range, "-") // split the id range into start and end

		id_range_start, err := strconv.Atoi(id_range_split[0])
		if err != nil {
			continue
		}

		id_range_end, err := strconv.Atoi(id_range_split[1])
		if err != nil {
			continue
		}

		for id := id_range_start; id <= id_range_end; id++ { // iterte over id range

			id_str := strconv.Itoa(id)
			//println(id_str)
			length := len(id_str)

			if length%2 == 1 {
				continue
			}

			id_left := id_str[:length/2]
			id_right := id_str[length/2:]

			if id_left == id_right {
				invalid_id_sum += int64(id)
			}
		}

	}

	println(invalid_id_sum)
}
