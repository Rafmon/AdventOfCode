package main

import (
	"fmt"
	"os"
	"path/filepath"
	"strings"
)

func main() {
	data, err := os.ReadFile(filepath.Join("res", "Day2_Input.txt"))

	if err != nil {
		panic(err)
	}

	parts := strings.Split(string(data), ",")

	for _, v := range parts {
		fmt.Println(v)
	}
}
