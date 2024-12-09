package de.rafmon.aoc._24._5;

public class PrintQueueInput {
	
	public static final String INPUT = 
			  "12|18\r\n"
			+ "47|12\r\n"
			+ "47|24\r\n"
			+ "27|19\r\n"
			+ "27|96\r\n"
			+ "27|85\r\n"
			+ "76|41\r\n"
			+ "76|47\r\n"
			+ "76|57\r\n"
			+ "76|39\r\n"
			+ "82|18\r\n"
			+ "82|17\r\n"
			+ "82|81\r\n"
			+ "82|25\r\n"
			+ "82|65\r\n"
			+ "58|66\r\n"
			+ "58|34\r\n"
			+ "58|76\r\n"
			+ "58|67\r\n"
			+ "58|68\r\n"
			+ "58|88\r\n"
			+ "34|76\r\n"
			+ "34|66\r\n"
			+ "34|37\r\n"
			+ "34|65\r\n"
			+ "34|68\r\n"
			+ "34|57\r\n"
			+ "34|64\r\n"
			+ "41|51\r\n"
			+ "41|85\r\n"
			+ "41|84\r\n"
			+ "41|91\r\n"
			+ "41|48\r\n"
			+ "41|55\r\n"
			+ "41|24\r\n"
			+ "41|12\r\n"
			+ "39|67\r\n"
			+ "39|84\r\n"
			+ "39|35\r\n"
			+ "39|34\r\n"
			+ "39|79\r\n"
			+ "39|56\r\n"
			+ "39|68\r\n"
			+ "39|65\r\n"
			+ "39|82\r\n"
			+ "48|58\r\n"
			+ "48|51\r\n"
			+ "48|55\r\n"
			+ "48|34\r\n"
			+ "48|53\r\n"
			+ "48|26\r\n"
			+ "48|24\r\n"
			+ "48|47\r\n"
			+ "48|65\r\n"
			+ "48|35\r\n"
			+ "71|73\r\n"
			+ "71|15\r\n"
			+ "71|57\r\n"
			+ "71|19\r\n"
			+ "71|39\r\n"
			+ "71|48\r\n"
			+ "71|58\r\n"
			+ "71|24\r\n"
			+ "71|85\r\n"
			+ "71|98\r\n"
			+ "71|99\r\n"
			+ "23|27\r\n"
			+ "23|81\r\n"
			+ "23|66\r\n"
			+ "23|93\r\n"
			+ "23|85\r\n"
			+ "23|91\r\n"
			+ "23|25\r\n"
			+ "23|68\r\n"
			+ "23|96\r\n"
			+ "23|89\r\n"
			+ "23|37\r\n"
			+ "23|28\r\n"
			+ "99|24\r\n"
			+ "99|53\r\n"
			+ "99|68\r\n"
			+ "99|35\r\n"
			+ "99|58\r\n"
			+ "99|65\r\n"
			+ "99|34\r\n"
			+ "99|56\r\n"
			+ "99|45\r\n"
			+ "99|97\r\n"
			+ "99|39\r\n"
			+ "99|12\r\n"
			+ "99|23\r\n"
			+ "85|45\r\n"
			+ "85|79\r\n"
			+ "85|19\r\n"
			+ "85|58\r\n"
			+ "85|65\r\n"
			+ "85|34\r\n"
			+ "85|35\r\n"
			+ "85|84\r\n"
			+ "85|48\r\n"
			+ "85|67\r\n"
			+ "85|51\r\n"
			+ "85|99\r\n"
			+ "85|88\r\n"
			+ "85|97\r\n"
			+ "35|84\r\n"
			+ "35|93\r\n"
			+ "35|88\r\n"
			+ "35|97\r\n"
			+ "35|42\r\n"
			+ "35|89\r\n"
			+ "35|67\r\n"
			+ "35|53\r\n"
			+ "35|58\r\n"
			+ "35|24\r\n"
			+ "35|26\r\n"
			+ "35|29\r\n"
			+ "35|56\r\n"
			+ "35|23\r\n"
			+ "35|81\r\n"
			+ "42|85\r\n"
			+ "42|48\r\n"
			+ "42|18\r\n"
			+ "42|91\r\n"
			+ "42|44\r\n"
			+ "42|41\r\n"
			+ "42|28\r\n"
			+ "42|71\r\n"
			+ "42|29\r\n"
			+ "42|57\r\n"
			+ "42|51\r\n"
			+ "42|81\r\n"
			+ "42|27\r\n"
			+ "42|66\r\n"
			+ "42|15\r\n"
			+ "42|96\r\n"
			+ "81|48\r\n"
			+ "81|18\r\n"
			+ "81|41\r\n"
			+ "81|44\r\n"
			+ "81|57\r\n"
			+ "81|76\r\n"
			+ "81|96\r\n"
			+ "81|29\r\n"
			+ "81|71\r\n"
			+ "81|25\r\n"
			+ "81|64\r\n"
			+ "81|66\r\n"
			+ "81|93\r\n"
			+ "81|19\r\n"
			+ "81|17\r\n"
			+ "81|28\r\n"
			+ "81|55\r\n"
			+ "79|84\r\n"
			+ "79|89\r\n"
			+ "79|45\r\n"
			+ "79|68\r\n"
			+ "79|88\r\n"
			+ "79|23\r\n"
			+ "79|76\r\n"
			+ "79|56\r\n"
			+ "79|81\r\n"
			+ "79|58\r\n"
			+ "79|97\r\n"
			+ "79|65\r\n"
			+ "79|42\r\n"
			+ "79|17\r\n"
			+ "79|26\r\n"
			+ "79|12\r\n"
			+ "79|82\r\n"
			+ "79|29\r\n"
			+ "88|23\r\n"
			+ "88|44\r\n"
			+ "88|29\r\n"
			+ "88|27\r\n"
			+ "88|68\r\n"
			+ "88|66\r\n"
			+ "88|42\r\n"
			+ "88|67\r\n"
			+ "88|25\r\n"
			+ "88|56\r\n"
			+ "88|15\r\n"
			+ "88|34\r\n"
			+ "88|82\r\n"
			+ "88|18\r\n"
			+ "88|65\r\n"
			+ "88|17\r\n"
			+ "88|89\r\n"
			+ "88|93\r\n"
			+ "88|71\r\n"
			+ "96|19\r\n"
			+ "96|99\r\n"
			+ "96|44\r\n"
			+ "96|51\r\n"
			+ "96|47\r\n"
			+ "96|15\r\n"
			+ "96|97\r\n"
			+ "96|71\r\n"
			+ "96|24\r\n"
			+ "96|39\r\n"
			+ "96|85\r\n"
			+ "96|55\r\n"
			+ "96|26\r\n"
			+ "96|57\r\n"
			+ "96|53\r\n"
			+ "96|91\r\n"
			+ "96|28\r\n"
			+ "96|73\r\n"
			+ "96|35\r\n"
			+ "96|41\r\n"
			+ "67|66\r\n"
			+ "67|29\r\n"
			+ "67|15\r\n"
			+ "67|81\r\n"
			+ "67|68\r\n"
			+ "67|93\r\n"
			+ "67|41\r\n"
			+ "67|25\r\n"
			+ "67|17\r\n"
			+ "67|91\r\n"
			+ "67|28\r\n"
			+ "67|71\r\n"
			+ "67|56\r\n"
			+ "67|44\r\n"
			+ "67|23\r\n"
			+ "67|42\r\n"
			+ "67|18\r\n"
			+ "67|96\r\n"
			+ "67|57\r\n"
			+ "67|37\r\n"
			+ "67|64\r\n"
			+ "91|24\r\n"
			+ "91|35\r\n"
			+ "91|28\r\n"
			+ "91|55\r\n"
			+ "91|98\r\n"
			+ "91|97\r\n"
			+ "91|58\r\n"
			+ "91|82\r\n"
			+ "91|85\r\n"
			+ "91|53\r\n"
			+ "91|84\r\n"
			+ "91|88\r\n"
			+ "91|73\r\n"
			+ "91|45\r\n"
			+ "91|79\r\n"
			+ "91|39\r\n"
			+ "91|47\r\n"
			+ "91|19\r\n"
			+ "91|26\r\n"
			+ "91|51\r\n"
			+ "91|99\r\n"
			+ "91|48\r\n"
			+ "17|44\r\n"
			+ "17|25\r\n"
			+ "17|19\r\n"
			+ "17|71\r\n"
			+ "17|99\r\n"
			+ "17|66\r\n"
			+ "17|73\r\n"
			+ "17|96\r\n"
			+ "17|15\r\n"
			+ "17|85\r\n"
			+ "17|27\r\n"
			+ "17|55\r\n"
			+ "17|39\r\n"
			+ "17|24\r\n"
			+ "17|37\r\n"
			+ "17|57\r\n"
			+ "17|28\r\n"
			+ "17|41\r\n"
			+ "17|51\r\n"
			+ "17|47\r\n"
			+ "17|35\r\n"
			+ "17|98\r\n"
			+ "17|48\r\n"
			+ "57|47\r\n"
			+ "57|19\r\n"
			+ "57|24\r\n"
			+ "57|51\r\n"
			+ "57|99\r\n"
			+ "57|58\r\n"
			+ "57|48\r\n"
			+ "57|84\r\n"
			+ "57|39\r\n"
			+ "57|73\r\n"
			+ "57|28\r\n"
			+ "57|88\r\n"
			+ "57|26\r\n"
			+ "57|45\r\n"
			+ "57|12\r\n"
			+ "57|79\r\n"
			+ "57|55\r\n"
			+ "57|91\r\n"
			+ "57|98\r\n"
			+ "57|35\r\n"
			+ "57|85\r\n"
			+ "57|53\r\n"
			+ "57|41\r\n"
			+ "57|97\r\n"
			+ "24|29\r\n"
			+ "24|12\r\n"
			+ "24|67\r\n"
			+ "24|65\r\n"
			+ "24|84\r\n"
			+ "24|97\r\n"
			+ "24|79\r\n"
			+ "24|23\r\n"
			+ "24|68\r\n"
			+ "24|53\r\n"
			+ "24|58\r\n"
			+ "24|42\r\n"
			+ "24|76\r\n"
			+ "24|34\r\n"
			+ "24|56\r\n"
			+ "24|88\r\n"
			+ "24|45\r\n"
			+ "24|89\r\n"
			+ "24|26\r\n"
			+ "24|18\r\n"
			+ "24|81\r\n"
			+ "24|82\r\n"
			+ "24|64\r\n"
			+ "24|93\r\n"
			+ "65|15\r\n"
			+ "65|29\r\n"
			+ "65|44\r\n"
			+ "65|76\r\n"
			+ "65|66\r\n"
			+ "65|56\r\n"
			+ "65|25\r\n"
			+ "65|23\r\n"
			+ "65|67\r\n"
			+ "65|81\r\n"
			+ "65|71\r\n"
			+ "65|93\r\n"
			+ "65|91\r\n"
			+ "65|57\r\n"
			+ "65|64\r\n"
			+ "65|27\r\n"
			+ "65|41\r\n"
			+ "65|68\r\n"
			+ "65|37\r\n"
			+ "65|18\r\n"
			+ "65|17\r\n"
			+ "65|96\r\n"
			+ "65|89\r\n"
			+ "65|42\r\n"
			+ "37|27\r\n"
			+ "37|44\r\n"
			+ "37|25\r\n"
			+ "37|98\r\n"
			+ "37|79\r\n"
			+ "37|51\r\n"
			+ "37|35\r\n"
			+ "37|73\r\n"
			+ "37|41\r\n"
			+ "37|28\r\n"
			+ "37|39\r\n"
			+ "37|55\r\n"
			+ "37|19\r\n"
			+ "37|26\r\n"
			+ "37|57\r\n"
			+ "37|96\r\n"
			+ "37|91\r\n"
			+ "37|24\r\n"
			+ "37|47\r\n"
			+ "37|71\r\n"
			+ "37|48\r\n"
			+ "37|99\r\n"
			+ "37|85\r\n"
			+ "37|15\r\n"
			+ "53|37\r\n"
			+ "53|34\r\n"
			+ "53|58\r\n"
			+ "53|82\r\n"
			+ "53|23\r\n"
			+ "53|89\r\n"
			+ "53|65\r\n"
			+ "53|66\r\n"
			+ "53|76\r\n"
			+ "53|29\r\n"
			+ "53|88\r\n"
			+ "53|93\r\n"
			+ "53|42\r\n"
			+ "53|68\r\n"
			+ "53|64\r\n"
			+ "53|81\r\n"
			+ "53|56\r\n"
			+ "53|17\r\n"
			+ "53|12\r\n"
			+ "53|18\r\n"
			+ "53|27\r\n"
			+ "53|84\r\n"
			+ "53|67\r\n"
			+ "53|45\r\n"
			+ "45|88\r\n"
			+ "45|34\r\n"
			+ "45|96\r\n"
			+ "45|82\r\n"
			+ "45|42\r\n"
			+ "45|58\r\n"
			+ "45|56\r\n"
			+ "45|12\r\n"
			+ "45|67\r\n"
			+ "45|68\r\n"
			+ "45|23\r\n"
			+ "45|76\r\n"
			+ "45|84\r\n"
			+ "45|64\r\n"
			+ "45|65\r\n"
			+ "45|66\r\n"
			+ "45|27\r\n"
			+ "45|81\r\n"
			+ "45|29\r\n"
			+ "45|18\r\n"
			+ "45|17\r\n"
			+ "45|93\r\n"
			+ "45|89\r\n"
			+ "45|37\r\n"
			+ "98|67\r\n"
			+ "98|73\r\n"
			+ "98|82\r\n"
			+ "98|45\r\n"
			+ "98|47\r\n"
			+ "98|23\r\n"
			+ "98|26\r\n"
			+ "98|56\r\n"
			+ "98|79\r\n"
			+ "98|39\r\n"
			+ "98|65\r\n"
			+ "98|35\r\n"
			+ "98|97\r\n"
			+ "98|99\r\n"
			+ "98|42\r\n"
			+ "98|88\r\n"
			+ "98|12\r\n"
			+ "98|53\r\n"
			+ "98|24\r\n"
			+ "98|34\r\n"
			+ "98|84\r\n"
			+ "98|19\r\n"
			+ "98|58\r\n"
			+ "98|68\r\n"
			+ "56|76\r\n"
			+ "56|18\r\n"
			+ "56|41\r\n"
			+ "56|37\r\n"
			+ "56|64\r\n"
			+ "56|96\r\n"
			+ "56|42\r\n"
			+ "56|71\r\n"
			+ "56|66\r\n"
			+ "56|93\r\n"
			+ "56|17\r\n"
			+ "56|68\r\n"
			+ "56|85\r\n"
			+ "56|91\r\n"
			+ "56|44\r\n"
			+ "56|27\r\n"
			+ "56|28\r\n"
			+ "56|25\r\n"
			+ "56|23\r\n"
			+ "56|15\r\n"
			+ "56|29\r\n"
			+ "56|57\r\n"
			+ "56|81\r\n"
			+ "56|89\r\n"
			+ "93|85\r\n"
			+ "93|51\r\n"
			+ "93|55\r\n"
			+ "93|29\r\n"
			+ "93|99\r\n"
			+ "93|91\r\n"
			+ "93|17\r\n"
			+ "93|19\r\n"
			+ "93|15\r\n"
			+ "93|37\r\n"
			+ "93|41\r\n"
			+ "93|44\r\n"
			+ "93|66\r\n"
			+ "93|98\r\n"
			+ "93|47\r\n"
			+ "93|57\r\n"
			+ "93|25\r\n"
			+ "93|73\r\n"
			+ "93|48\r\n"
			+ "93|76\r\n"
			+ "93|71\r\n"
			+ "93|28\r\n"
			+ "93|27\r\n"
			+ "93|96\r\n"
			+ "73|39\r\n"
			+ "73|34\r\n"
			+ "73|81\r\n"
			+ "73|82\r\n"
			+ "73|42\r\n"
			+ "73|23\r\n"
			+ "73|56\r\n"
			+ "73|65\r\n"
			+ "73|88\r\n"
			+ "73|84\r\n"
			+ "73|67\r\n"
			+ "73|45\r\n"
			+ "73|89\r\n"
			+ "73|53\r\n"
			+ "73|12\r\n"
			+ "73|58\r\n"
			+ "73|97\r\n"
			+ "73|24\r\n"
			+ "73|79\r\n"
			+ "73|35\r\n"
			+ "73|99\r\n"
			+ "73|26\r\n"
			+ "73|18\r\n"
			+ "73|68\r\n"
			+ "44|35\r\n"
			+ "44|53\r\n"
			+ "44|79\r\n"
			+ "44|47\r\n"
			+ "44|99\r\n"
			+ "44|28\r\n"
			+ "44|26\r\n"
			+ "44|98\r\n"
			+ "44|85\r\n"
			+ "44|57\r\n"
			+ "44|15\r\n"
			+ "44|45\r\n"
			+ "44|24\r\n"
			+ "44|73\r\n"
			+ "44|97\r\n"
			+ "44|48\r\n"
			+ "44|51\r\n"
			+ "44|91\r\n"
			+ "44|71\r\n"
			+ "44|19\r\n"
			+ "44|58\r\n"
			+ "44|41\r\n"
			+ "44|55\r\n"
			+ "44|39\r\n"
			+ "97|34\r\n"
			+ "97|12\r\n"
			+ "97|56\r\n"
			+ "97|18\r\n"
			+ "97|76\r\n"
			+ "97|45\r\n"
			+ "97|81\r\n"
			+ "97|58\r\n"
			+ "97|42\r\n"
			+ "97|17\r\n"
			+ "97|65\r\n"
			+ "97|29\r\n"
			+ "97|89\r\n"
			+ "97|93\r\n"
			+ "97|84\r\n"
			+ "97|37\r\n"
			+ "97|64\r\n"
			+ "97|66\r\n"
			+ "97|82\r\n"
			+ "97|67\r\n"
			+ "97|23\r\n"
			+ "97|53\r\n"
			+ "97|68\r\n"
			+ "97|88\r\n"
			+ "29|99\r\n"
			+ "29|73\r\n"
			+ "29|28\r\n"
			+ "29|71\r\n"
			+ "29|27\r\n"
			+ "29|25\r\n"
			+ "29|98\r\n"
			+ "29|76\r\n"
			+ "29|55\r\n"
			+ "29|15\r\n"
			+ "29|17\r\n"
			+ "29|44\r\n"
			+ "29|37\r\n"
			+ "29|19\r\n"
			+ "29|51\r\n"
			+ "29|47\r\n"
			+ "29|91\r\n"
			+ "29|39\r\n"
			+ "29|96\r\n"
			+ "29|57\r\n"
			+ "29|66\r\n"
			+ "29|85\r\n"
			+ "29|41\r\n"
			+ "29|48\r\n"
			+ "28|45\r\n"
			+ "28|24\r\n"
			+ "28|79\r\n"
			+ "28|82\r\n"
			+ "28|98\r\n"
			+ "28|12\r\n"
			+ "28|55\r\n"
			+ "28|35\r\n"
			+ "28|47\r\n"
			+ "28|73\r\n"
			+ "28|99\r\n"
			+ "28|51\r\n"
			+ "28|84\r\n"
			+ "28|48\r\n"
			+ "28|88\r\n"
			+ "28|19\r\n"
			+ "28|58\r\n"
			+ "28|26\r\n"
			+ "28|85\r\n"
			+ "28|53\r\n"
			+ "28|34\r\n"
			+ "28|65\r\n"
			+ "28|39\r\n"
			+ "28|97\r\n"
			+ "18|76\r\n"
			+ "18|91\r\n"
			+ "18|57\r\n"
			+ "18|29\r\n"
			+ "18|37\r\n"
			+ "18|93\r\n"
			+ "18|98\r\n"
			+ "18|41\r\n"
			+ "18|28\r\n"
			+ "18|51\r\n"
			+ "18|48\r\n"
			+ "18|64\r\n"
			+ "18|71\r\n"
			+ "18|55\r\n"
			+ "18|15\r\n"
			+ "18|66\r\n"
			+ "18|17\r\n"
			+ "18|47\r\n"
			+ "18|25\r\n"
			+ "18|44\r\n"
			+ "18|27\r\n"
			+ "18|96\r\n"
			+ "18|19\r\n"
			+ "18|85\r\n"
			+ "55|68\r\n"
			+ "55|26\r\n"
			+ "55|99\r\n"
			+ "55|23\r\n"
			+ "55|88\r\n"
			+ "55|56\r\n"
			+ "55|35\r\n"
			+ "55|47\r\n"
			+ "55|34\r\n"
			+ "55|97\r\n"
			+ "55|39\r\n"
			+ "55|73\r\n"
			+ "55|67\r\n"
			+ "55|53\r\n"
			+ "55|58\r\n"
			+ "55|84\r\n"
			+ "55|98\r\n"
			+ "55|82\r\n"
			+ "55|24\r\n"
			+ "55|45\r\n"
			+ "55|12\r\n"
			+ "55|65\r\n"
			+ "55|19\r\n"
			+ "55|79\r\n"
			+ "66|19\r\n"
			+ "66|44\r\n"
			+ "66|15\r\n"
			+ "66|71\r\n"
			+ "66|48\r\n"
			+ "66|47\r\n"
			+ "66|27\r\n"
			+ "66|91\r\n"
			+ "66|98\r\n"
			+ "66|85\r\n"
			+ "66|57\r\n"
			+ "66|35\r\n"
			+ "66|28\r\n"
			+ "66|99\r\n"
			+ "66|51\r\n"
			+ "66|79\r\n"
			+ "66|25\r\n"
			+ "66|96\r\n"
			+ "66|41\r\n"
			+ "66|39\r\n"
			+ "66|37\r\n"
			+ "66|24\r\n"
			+ "66|73\r\n"
			+ "66|55\r\n"
			+ "15|53\r\n"
			+ "15|12\r\n"
			+ "15|47\r\n"
			+ "15|26\r\n"
			+ "15|24\r\n"
			+ "15|55\r\n"
			+ "15|98\r\n"
			+ "15|45\r\n"
			+ "15|48\r\n"
			+ "15|57\r\n"
			+ "15|58\r\n"
			+ "15|84\r\n"
			+ "15|79\r\n"
			+ "15|41\r\n"
			+ "15|28\r\n"
			+ "15|99\r\n"
			+ "15|97\r\n"
			+ "15|91\r\n"
			+ "15|51\r\n"
			+ "15|35\r\n"
			+ "15|73\r\n"
			+ "15|39\r\n"
			+ "15|19\r\n"
			+ "15|85\r\n"
			+ "25|19\r\n"
			+ "25|57\r\n"
			+ "25|71\r\n"
			+ "25|51\r\n"
			+ "25|97\r\n"
			+ "25|99\r\n"
			+ "25|35\r\n"
			+ "25|91\r\n"
			+ "25|48\r\n"
			+ "25|41\r\n"
			+ "25|47\r\n"
			+ "25|24\r\n"
			+ "25|55\r\n"
			+ "25|73\r\n"
			+ "25|15\r\n"
			+ "25|85\r\n"
			+ "25|39\r\n"
			+ "25|45\r\n"
			+ "25|44\r\n"
			+ "25|26\r\n"
			+ "25|28\r\n"
			+ "25|53\r\n"
			+ "25|79\r\n"
			+ "25|98\r\n"
			+ "19|42\r\n"
			+ "19|58\r\n"
			+ "19|39\r\n"
			+ "19|99\r\n"
			+ "19|26\r\n"
			+ "19|56\r\n"
			+ "19|88\r\n"
			+ "19|23\r\n"
			+ "19|24\r\n"
			+ "19|34\r\n"
			+ "19|45\r\n"
			+ "19|97\r\n"
			+ "19|53\r\n"
			+ "19|89\r\n"
			+ "19|35\r\n"
			+ "19|12\r\n"
			+ "19|73\r\n"
			+ "19|79\r\n"
			+ "19|67\r\n"
			+ "19|82\r\n"
			+ "19|68\r\n"
			+ "19|65\r\n"
			+ "19|84\r\n"
			+ "19|47\r\n"
			+ "89|37\r\n"
			+ "89|29\r\n"
			+ "89|66\r\n"
			+ "89|98\r\n"
			+ "89|27\r\n"
			+ "89|17\r\n"
			+ "89|18\r\n"
			+ "89|25\r\n"
			+ "89|41\r\n"
			+ "89|81\r\n"
			+ "89|64\r\n"
			+ "89|28\r\n"
			+ "89|85\r\n"
			+ "89|76\r\n"
			+ "89|93\r\n"
			+ "89|48\r\n"
			+ "89|51\r\n"
			+ "89|71\r\n"
			+ "89|15\r\n"
			+ "89|91\r\n"
			+ "89|96\r\n"
			+ "89|55\r\n"
			+ "89|57\r\n"
			+ "89|44\r\n"
			+ "84|18\r\n"
			+ "84|89\r\n"
			+ "84|42\r\n"
			+ "84|71\r\n"
			+ "84|76\r\n"
			+ "84|93\r\n"
			+ "84|64\r\n"
			+ "84|67\r\n"
			+ "84|66\r\n"
			+ "84|88\r\n"
			+ "84|56\r\n"
			+ "84|82\r\n"
			+ "84|68\r\n"
			+ "84|17\r\n"
			+ "84|81\r\n"
			+ "84|37\r\n"
			+ "84|44\r\n"
			+ "84|23\r\n"
			+ "84|65\r\n"
			+ "84|25\r\n"
			+ "84|34\r\n"
			+ "84|96\r\n"
			+ "84|27\r\n"
			+ "84|29\r\n"
			+ "26|29\r\n"
			+ "26|42\r\n"
			+ "26|53\r\n"
			+ "26|58\r\n"
			+ "26|45\r\n"
			+ "26|97\r\n"
			+ "26|64\r\n"
			+ "26|82\r\n"
			+ "26|18\r\n"
			+ "26|76\r\n"
			+ "26|56\r\n"
			+ "26|34\r\n"
			+ "26|68\r\n"
			+ "26|81\r\n"
			+ "26|12\r\n"
			+ "26|93\r\n"
			+ "26|66\r\n"
			+ "26|89\r\n"
			+ "26|65\r\n"
			+ "26|67\r\n"
			+ "26|84\r\n"
			+ "26|23\r\n"
			+ "26|17\r\n"
			+ "26|88\r\n"
			+ "68|57\r\n"
			+ "68|48\r\n"
			+ "68|41\r\n"
			+ "68|89\r\n"
			+ "68|96\r\n"
			+ "68|15\r\n"
			+ "68|29\r\n"
			+ "68|42\r\n"
			+ "68|81\r\n"
			+ "68|28\r\n"
			+ "68|91\r\n"
			+ "68|51\r\n"
			+ "68|93\r\n"
			+ "68|64\r\n"
			+ "68|76\r\n"
			+ "68|17\r\n"
			+ "68|66\r\n"
			+ "68|44\r\n"
			+ "68|25\r\n"
			+ "68|85\r\n"
			+ "68|27\r\n"
			+ "68|37\r\n"
			+ "68|18\r\n"
			+ "68|71\r\n"
			+ "64|44\r\n"
			+ "64|66\r\n"
			+ "64|93\r\n"
			+ "64|71\r\n"
			+ "64|96\r\n"
			+ "64|76\r\n"
			+ "64|29\r\n"
			+ "64|85\r\n"
			+ "64|27\r\n"
			+ "64|57\r\n"
			+ "64|51\r\n"
			+ "64|47\r\n"
			+ "64|37\r\n"
			+ "64|91\r\n"
			+ "64|98\r\n"
			+ "64|55\r\n"
			+ "64|48\r\n"
			+ "64|15\r\n"
			+ "64|17\r\n"
			+ "64|41\r\n"
			+ "64|19\r\n"
			+ "64|25\r\n"
			+ "64|28\r\n"
			+ "64|73\r\n"
			+ "51|45\r\n"
			+ "51|88\r\n"
			+ "51|58\r\n"
			+ "51|82\r\n"
			+ "51|79\r\n"
			+ "51|98\r\n"
			+ "51|19\r\n"
			+ "51|53\r\n"
			+ "51|99\r\n"
			+ "51|84\r\n"
			+ "51|39\r\n"
			+ "51|56\r\n"
			+ "51|35\r\n"
			+ "51|12\r\n"
			+ "51|65\r\n"
			+ "51|47\r\n"
			+ "51|67\r\n"
			+ "51|55\r\n"
			+ "51|23\r\n"
			+ "51|73\r\n"
			+ "51|24\r\n"
			+ "51|97\r\n"
			+ "51|26\r\n"
			+ "51|34\r\n"
			+ "12|27\r\n"
			+ "12|64\r\n"
			+ "12|25\r\n"
			+ "12|84\r\n"
			+ "12|42\r\n"
			+ "12|76\r\n"
			+ "12|65\r\n"
			+ "12|67\r\n"
			+ "12|29\r\n"
			+ "12|66\r\n"
			+ "12|68\r\n"
			+ "12|89\r\n"
			+ "12|82\r\n"
			+ "12|88\r\n"
			+ "12|17\r\n"
			+ "12|56\r\n"
			+ "12|37\r\n"
			+ "12|34\r\n"
			+ "12|23\r\n"
			+ "12|96\r\n"
			+ "12|81\r\n"
			+ "12|44\r\n"
			+ "12|93\r\n"
			+ "47|89\r\n"
			+ "47|81\r\n"
			+ "47|67\r\n"
			+ "47|23\r\n"
			+ "47|82\r\n"
			+ "47|79\r\n"
			+ "47|99\r\n"
			+ "47|56\r\n"
			+ "47|53\r\n"
			+ "47|88\r\n"
			+ "47|84\r\n"
			+ "47|65\r\n"
			+ "47|45\r\n"
			+ "47|42\r\n"
			+ "47|68\r\n"
			+ "47|35\r\n"
			+ "47|26\r\n"
			+ "47|97\r\n"
			+ "47|73\r\n"
			+ "47|58\r\n"
			+ "47|39\r\n"
			+ "47|34\r\n"
			+ "27|39\r\n"
			+ "27|28\r\n"
			+ "27|24\r\n"
			+ "27|71\r\n"
			+ "27|99\r\n"
			+ "27|79\r\n"
			+ "27|47\r\n"
			+ "27|48\r\n"
			+ "27|51\r\n"
			+ "27|98\r\n"
			+ "27|97\r\n"
			+ "27|44\r\n"
			+ "27|15\r\n"
			+ "27|26\r\n"
			+ "27|35\r\n"
			+ "27|25\r\n"
			+ "27|73\r\n"
			+ "27|55\r\n"
			+ "27|91\r\n"
			+ "27|57\r\n"
			+ "27|41\r\n"
			+ "76|73\r\n"
			+ "76|25\r\n"
			+ "76|98\r\n"
			+ "76|51\r\n"
			+ "76|15\r\n"
			+ "76|19\r\n"
			+ "76|28\r\n"
			+ "76|55\r\n"
			+ "76|37\r\n"
			+ "76|71\r\n"
			+ "76|35\r\n"
			+ "76|96\r\n"
			+ "76|27\r\n"
			+ "76|85\r\n"
			+ "76|99\r\n"
			+ "76|48\r\n"
			+ "76|44\r\n"
			+ "76|91\r\n"
			+ "76|17\r\n"
			+ "76|66\r\n"
			+ "82|41\r\n"
			+ "82|71\r\n"
			+ "82|15\r\n"
			+ "82|93\r\n"
			+ "82|66\r\n"
			+ "82|64\r\n"
			+ "82|44\r\n"
			+ "82|37\r\n"
			+ "82|57\r\n"
			+ "82|23\r\n"
			+ "82|96\r\n"
			+ "82|42\r\n"
			+ "82|27\r\n"
			+ "82|29\r\n"
			+ "82|67\r\n"
			+ "82|76\r\n"
			+ "82|56\r\n"
			+ "82|89\r\n"
			+ "82|68\r\n"
			+ "58|17\r\n"
			+ "58|82\r\n"
			+ "58|89\r\n"
			+ "58|84\r\n"
			+ "58|29\r\n"
			+ "58|18\r\n"
			+ "58|27\r\n"
			+ "58|96\r\n"
			+ "58|37\r\n"
			+ "58|23\r\n"
			+ "58|81\r\n"
			+ "58|65\r\n"
			+ "58|64\r\n"
			+ "58|56\r\n"
			+ "58|42\r\n"
			+ "58|25\r\n"
			+ "58|12\r\n"
			+ "58|93\r\n"
			+ "34|29\r\n"
			+ "34|67\r\n"
			+ "34|25\r\n"
			+ "34|71\r\n"
			+ "34|96\r\n"
			+ "34|81\r\n"
			+ "34|18\r\n"
			+ "34|89\r\n"
			+ "34|27\r\n"
			+ "34|56\r\n"
			+ "34|93\r\n"
			+ "34|15\r\n"
			+ "34|82\r\n"
			+ "34|44\r\n"
			+ "34|23\r\n"
			+ "34|42\r\n"
			+ "34|17\r\n"
			+ "41|53\r\n"
			+ "41|28\r\n"
			+ "41|79\r\n"
			+ "41|58\r\n"
			+ "41|19\r\n"
			+ "41|73\r\n"
			+ "41|97\r\n"
			+ "41|39\r\n"
			+ "41|35\r\n"
			+ "41|99\r\n"
			+ "41|34\r\n"
			+ "41|47\r\n"
			+ "41|88\r\n"
			+ "41|98\r\n"
			+ "41|45\r\n"
			+ "41|26\r\n"
			+ "39|64\r\n"
			+ "39|45\r\n"
			+ "39|12\r\n"
			+ "39|93\r\n"
			+ "39|88\r\n"
			+ "39|42\r\n"
			+ "39|97\r\n"
			+ "39|26\r\n"
			+ "39|58\r\n"
			+ "39|18\r\n"
			+ "39|23\r\n"
			+ "39|89\r\n"
			+ "39|24\r\n"
			+ "39|81\r\n"
			+ "39|53\r\n"
			+ "48|97\r\n"
			+ "48|88\r\n"
			+ "48|19\r\n"
			+ "48|82\r\n"
			+ "48|12\r\n"
			+ "48|39\r\n"
			+ "48|56\r\n"
			+ "48|79\r\n"
			+ "48|45\r\n"
			+ "48|67\r\n"
			+ "48|73\r\n"
			+ "48|84\r\n"
			+ "48|98\r\n"
			+ "48|99\r\n"
			+ "71|51\r\n"
			+ "71|12\r\n"
			+ "71|55\r\n"
			+ "71|35\r\n"
			+ "71|79\r\n"
			+ "71|97\r\n"
			+ "71|45\r\n"
			+ "71|41\r\n"
			+ "71|47\r\n"
			+ "71|53\r\n"
			+ "71|26\r\n"
			+ "71|28\r\n"
			+ "71|91\r\n"
			+ "23|64\r\n"
			+ "23|42\r\n"
			+ "23|41\r\n"
			+ "23|17\r\n"
			+ "23|57\r\n"
			+ "23|76\r\n"
			+ "23|44\r\n"
			+ "23|71\r\n"
			+ "23|29\r\n"
			+ "23|48\r\n"
			+ "23|15\r\n"
			+ "23|18\r\n"
			+ "99|42\r\n"
			+ "99|26\r\n"
			+ "99|84\r\n"
			+ "99|18\r\n"
			+ "99|89\r\n"
			+ "99|82\r\n"
			+ "99|64\r\n"
			+ "99|67\r\n"
			+ "99|88\r\n"
			+ "99|81\r\n"
			+ "99|79\r\n"
			+ "85|47\r\n"
			+ "85|73\r\n"
			+ "85|24\r\n"
			+ "85|12\r\n"
			+ "85|26\r\n"
			+ "85|55\r\n"
			+ "85|39\r\n"
			+ "85|98\r\n"
			+ "85|82\r\n"
			+ "85|53\r\n"
			+ "35|64\r\n"
			+ "35|34\r\n"
			+ "35|12\r\n"
			+ "35|68\r\n"
			+ "35|65\r\n"
			+ "35|79\r\n"
			+ "35|18\r\n"
			+ "35|82\r\n"
			+ "35|45\r\n"
			+ "42|93\r\n"
			+ "42|89\r\n"
			+ "42|17\r\n"
			+ "42|55\r\n"
			+ "42|37\r\n"
			+ "42|25\r\n"
			+ "42|64\r\n"
			+ "42|76\r\n"
			+ "81|37\r\n"
			+ "81|15\r\n"
			+ "81|98\r\n"
			+ "81|91\r\n"
			+ "81|27\r\n"
			+ "81|51\r\n"
			+ "81|85\r\n"
			+ "79|67\r\n"
			+ "79|18\r\n"
			+ "79|53\r\n"
			+ "79|34\r\n"
			+ "79|93\r\n"
			+ "79|64\r\n"
			+ "88|64\r\n"
			+ "88|96\r\n"
			+ "88|37\r\n"
			+ "88|81\r\n"
			+ "88|76\r\n"
			+ "96|25\r\n"
			+ "96|98\r\n"
			+ "96|79\r\n"
			+ "96|48\r\n"
			+ "67|76\r\n"
			+ "67|89\r\n"
			+ "67|27\r\n"
			+ "91|12\r\n"
			+ "91|34\r\n"
			+ "17|91\r\n"
			+ "\r\n"
			+ "64,17,25,44,28,98,47\r\n"
			+ "45,35,39,47,23,97,68,67,26,73,98\r\n"
			+ "89,64,29,76,17,27,96,71,57,91,85,48,55\r\n"
			+ "67,89,65,84,76,81,17,29,56,53,88,34,23,82,12,64,45,18,42,68,93,58,26\r\n"
			+ "67,56,71,89,76,93,57,91,68,81,41,44,18\r\n"
			+ "99,35,24,26,97,53,45,58,12,84,88,34,82,67,56,68,42,81,18\r\n"
			+ "44,71,15,41,28,51,98,19,73,99,39,35,24\r\n"
			+ "18,64,29,76,85\r\n"
			+ "88,84,45,53,89,65,64,37,56,34,68,76,12\r\n"
			+ "34,82,65,67,56,23,68,89,81,18,64,93,29,76,17,66,37,27,96,25,44,71,15\r\n"
			+ "47,73,24,79,97,53,58,12,88,34,82,67,23,68,89\r\n"
			+ "53,19,51,73,57,98,79,84,99\r\n"
			+ "76,17,66,37,27,96,91,28,98,47,73,99,39\r\n"
			+ "65,81,37,23,96,42,44,84,93\r\n"
			+ "96,25,71,15,41,91,28,85,48,55,19,47,99,24,79,26,97\r\n"
			+ "35,34,24,55,53,67,98,99,58,48,45\r\n"
			+ "91,44,19,93,18,96,37,15,98\r\n"
			+ "84,82,65,67,23,68,42,89,93,29,76,17,66,37,96,25,44\r\n"
			+ "27,76,71,15,55,99,37,66,48,28,47,73,44,96,19\r\n"
			+ "19,47,73,99,39,35,79,26,97,53,45,58,12,84,88,34,82,67,56,23,42\r\n"
			+ "96,44,71,15,57,41,91,28,85,48,55,47,39,35,79,26,97\r\n"
			+ "37,27,25,44,71,15,57,41,91,48,51,55,47,73,99,39,35,24,79\r\n"
			+ "24,39,34,88,97\r\n"
			+ "68,42,81,26,53,79,58,76,97\r\n"
			+ "24,67,81,34,35,79,68,88,53,64,42,82,56,84,93,12,18,65,97,58,89\r\n"
			+ "39,35,24,79,97,45,58,88,82,65,56,68,42,81,64\r\n"
			+ "45,12,84,82,67,23,89,81,18,64,93,76,66,37,27\r\n"
			+ "12,68,88,89,23,76,42,53,29,34,97,58,26,84,18,93,45\r\n"
			+ "65,26,81,23,53\r\n"
			+ "12,88,82,65,56,23,89,81,18,64,29,17,66,37,27,96,25\r\n"
			+ "55,98,19,73,99,35,79,97,58,34,23\r\n"
			+ "34,68,42,89,81\r\n"
			+ "57,18,44,37,89,55,71,15,66,81,29,76,48,27,17,93,85,96,41,91,28\r\n"
			+ "73,99,79,45,88,68,42,89,81\r\n"
			+ "51,98,73,99,97,53,45,58,56\r\n"
			+ "89,81,18,64,93,29,76,17,27,44,71,15,57,41,91,85,48,51,55\r\n"
			+ "97,35,47,55,85,99,53,45,28,84,48\r\n"
			+ "47,99,29,71,66,57,96,41,76,85,37,98,48,44,17,73,19,28,51,27,15\r\n"
			+ "27,37,51,76,28,99,66,47,19,15,39,57,71,44,96,48,41,17,25,91,55\r\n"
			+ "25,71,17,42,15\r\n"
			+ "48,98,47,99,24,26,53,45,84,82,67\r\n"
			+ "65,81,18,93,27,96,41\r\n"
			+ "39,12,42,81,64\r\n"
			+ "73,57,28,19,85,27,71,55,44,48,17\r\n"
			+ "98,19,47,73,99,35,79,26,97,53,45,58,84,88,34,82,65,67,56,23,68\r\n"
			+ "15,25,73,28,98,57,39,24,85,51,53,55,44,97,41,35,79,71,99,19,26\r\n"
			+ "85,51,55,19,47,99,39,35,24,79,97,45,58,12,84,34,65\r\n"
			+ "76,66,64,17,18,44,51,15,91,37,98,81,71,29,85,93,96\r\n"
			+ "57,91,28,85,48,51,55,98,19,39,35,24,79,26,97,53,58,12,84\r\n"
			+ "82,19,35,26,79,53,39,24,34,99,51,55,12,97,67,56,65,84,47,45,73,98,88\r\n"
			+ "44,76,93,64,66\r\n"
			+ "42,93,29,76,37,48,51\r\n"
			+ "19,47,73,39,35,24,26,58,12,84,34,67,42\r\n"
			+ "67,42,79,88,97,12,23,81,76\r\n"
			+ "35,24,79,97,84,82,65\r\n"
			+ "47,41,55,98,51,99,85,15,97,12,39\r\n"
			+ "58,12,84,88,34,82,65,67,56,68,42,89,81,18,64,93,29,76,17,66,37,27,96\r\n"
			+ "89,81,34,68,17,65,56,45,12,67,76\r\n"
			+ "57,81,76,85,42,28,66,64,89,29,15,23,96,93,37\r\n"
			+ "28,85,51,55,19,45,84\r\n"
			+ "96,25,71,15,57,91,28,85,48,51,55,98,47,73,99,24,79,26,97\r\n"
			+ "37,25,44,57,41,91,85,48,51,55,98,99,39,35,79\r\n"
			+ "39,35,97,45,34,82,56,68,42,89,64\r\n"
			+ "85,48,51,55,73,24,97,53,12,88,65\r\n"
			+ "15,51,19,64,28,27,37,76,96,17,29,18,85,91,66,93,57,71,44,25,55,98,48\r\n"
			+ "15,41,91,28,85,55,19,99,39,35,26\r\n"
			+ "68,82,27,89,93,29,18,23,65,15,71,34,25\r\n"
			+ "29,66,45,65,18,82,17,88,84,81,34,76,12,58,64,89,42\r\n"
			+ "39,35,79,26,53,45,58,84,56,23,68,89,18\r\n"
			+ "85,19,25,17,48,28,39,55,99,73,35,57,47,66,41\r\n"
			+ "42,89,81,64,93,29,76,17,66,37,27,96,25,44,71,15,57,41,91,28,85,48,51\r\n"
			+ "98,39,79,97,84,34,82,23,68\r\n"
			+ "68,81,64,93,29,27,25,44,15,57,91\r\n"
			+ "24,79,26,97,53,45,58,12,84,34,82,67,56,23,68,42,89,81,29\r\n"
			+ "18,41,19,17,15,27,91\r\n"
			+ "28,45,58,99,98,51,26,47,53,19,24,48,88,97,84,91,79,12,85,34,73\r\n"
			+ "28,64,51,96,47,15,17\r\n"
			+ "37,25,44,57,41,91,28,51,55,19,47,73,99,39,24\r\n"
			+ "53,73,39,79,28,19,15,58,57,55,24,97,12,91,26,47,48,51,85\r\n"
			+ "76,56,93,42,82,15,64,44,34\r\n"
			+ "85,19,58,15,41,73,53,12,48,79,99\r\n"
			+ "65,35,73,68,24,84,82,47,89\r\n"
			+ "29,96,85,66,28,18,15,55,17,25,71,76,27,44,19\r\n"
			+ "15,57,41,91,28,85,48,51,55,98,19,47,73,99,39,35,24,79,26,97,53,45,12\r\n"
			+ "15,66,47,37,44,51,24,39,99,28,98,85,25,55,27,96,73\r\n"
			+ "65,67,56,23,42,81,18,93,29,76,17,27,25,44,71,57,41\r\n"
			+ "48,98,47,99,39,24,79,26,97,45,12,84,88,34,82,65,67\r\n"
			+ "67,96,34,65,25,81,17,66,56,27,76,89,71,37,93,82,42,44,68\r\n"
			+ "44,91,39,48,79,24,53,28,26,41,57,99,51,97,85,35,55,25,47\r\n"
			+ "53,45,58,12,84,88,34,82,65,68,42,89,81,18,64,93,29,76,17,66,37\r\n"
			+ "17,68,76,18,88,37,96,56,58,64,12\r\n"
			+ "39,35,53,58,88,67,23,68,42,89,81,18,64\r\n"
			+ "66,37,96,25,71,15,57,85,19\r\n"
			+ "97,55,73,53,19,47,98\r\n"
			+ "82,96,56,25,29,66,18,89,23,76,44,65,88\r\n"
			+ "37,81,89,44,66,48,85,57,27,68,15,28,17,25,93,41,96,18,29\r\n"
			+ "73,81,84,39,82,99,68\r\n"
			+ "91,48,51,73,35,79,97,84,34\r\n"
			+ "41,37,48,66,96,27,91,64,85,29,71,17,76,93,51,47,19,57,25\r\n"
			+ "97,45,58,12,84,88,67,56,23,42,81,18,64,93,29,17,66\r\n"
			+ "15,37,39,35,28,44,24,85,99,27,57,91,98,66,41,55,25\r\n"
			+ "99,39,35,24,79,26,53,45,58,12,84,88,34,82,65,67,56,23,68,42,89,81,18\r\n"
			+ "98,45,41,57,35,58,47,85,51,97,91,12,15,24,73\r\n"
			+ "29,71,93,65,68,18,37,89,42,64,81,96,88,67,23,44,27,82,34,56,25,66,76\r\n"
			+ "98,81,18,48,76,37,85,93,66,96,27,29,17,41,44\r\n"
			+ "99,39,35,24,79,26,53,58,12,84,82,65,67,56,42,89,18\r\n"
			+ "57,28,55,27,76,44,15,18,81,17,29,37,64,85,41,93,89,71,96\r\n"
			+ "17,42,29,44,71,15,76,37,93,96,82,18,64,65,57,67,25,81,68,89,23,27,56\r\n"
			+ "19,37,39,96,35,71,98,48,28,79,91,85,25\r\n"
			+ "55,19,99,26,97,45,58,34,82,56,23\r\n"
			+ "82,84,23,26,55,73,45,79,67,88,53,39,47\r\n"
			+ "35,24,26,97,58,84,34,82,67,56,23,68,89,81,18,64,93\r\n"
			+ "88,79,84,58,23,47,45,35,19,82,12,42,56,67,24,68,39\r\n"
			+ "27,55,19,47,99\r\n"
			+ "68,82,53,56,84,76,97,23,58,65,93,79,67\r\n"
			+ "79,98,96,51,27,91,26,47,85\r\n"
			+ "42,89,81,18,64,76,17,66,37,27,96,25,44,71,15,57,41,91,85,48,51\r\n"
			+ "68,53,34,58,23,45,84,99,79,65,35,73,88,56,97,81,24\r\n"
			+ "57,41,91,28,85,51,55,98,19,47,73,99,39,35,24,79,26,97,53,45,58,12,84\r\n"
			+ "42,17,44,71,18,27,57,64,25,89,65,96,56\r\n"
			+ "85,51,55,98,19,47,73,39,35,24,79,26,45,58,84,88,34,82,65\r\n"
			+ "93,29,37,41,85,51,55,47,73\r\n"
			+ "44,57,41,28,48,98,19,47,73,39,24,79,26\r\n"
			+ "19,97,41,57,79,51,85,44,15,39,35,98,99,96,91,47,55,48,25,28,24\r\n"
			+ "29,17,96,25,41,91,85,55,98,73,99\r\n"
			+ "91,28,51,98,47,73,99,39,35,24,79,26,97,53,45,12,84\r\n"
			+ "93,29,76,17,66,37,27,96,25,44,15,57,41,91,28,51,98,19,73\r\n"
			+ "64,29,76,66,37,96,25,44,57,28,85,48,51,98,19\r\n"
			+ "42,89,15,81,37,64,44,91,17,57,25,66,93,28,71,56,18,96,76,23,27\r\n"
			+ "29,64,76,48,51,44,93,18,71,19,37\r\n"
			+ "37,93,64,25,67\r\n"
			+ "28,85,48,55,98,19,39,24,26,97,45,12,84\r\n"
			+ "71,45,47,48,26,91,51,39,58\r\n"
			+ "41,47,15,48,71,85,55,97,91,73,58\r\n"
			+ "12,88,34,56,68,42,89,18,64,93,29,76,66,27,25\r\n"
			+ "23,42,41,81,85,68,29\r\n"
			+ "17,37,96,25,41,28,48,98,47,73,35\r\n"
			+ "89,18,93,29,76,66,37,25,44,71,15,57,41,91,48,51,55\r\n"
			+ "85,51,55,19,73,39,35,26,97,53,88,34,65\r\n"
			+ "15,65,71,82,34,17,81\r\n"
			+ "71,57,85,48,55,98,35\r\n"
			+ "42,89,64,93,29,76,37,27,96,25,44,41,91,48,51\r\n"
			+ "51,19,55,25,48\r\n"
			+ "82,76,34,42,81,64,27,65,18,66,88,56,23,68,89,29,37\r\n"
			+ "48,51,98,19,39,88,67\r\n"
			+ "64,93,29,76,37,96,44,15,28,85,48,51,19\r\n"
			+ "79,97,58,12,84,88,82,67,68,42,89,64,93,29,76\r\n"
			+ "56,97,24,26,42,67,84,89,58,65,34,45,64,12,23,53,88,93,79,82,18\r\n"
			+ "48,47,99,79,45\r\n"
			+ "39,35,73,97,85,55,48\r\n"
			+ "65,56,81,18,93,17,66,37,44,71,41\r\n"
			+ "91,28,85,48,55,98,19,47,73,99,39,35,24,79,26,97,53,45,58,12,84,88,34\r\n"
			+ "17,23,56,89,93,96,29,76,66,27,25,71,44,68,18,42,81,28,64\r\n"
			+ "34,82,65,67,56,23,68,42,89,81,18,64,93,76,17,66,37,27,96,25,44,71,15\r\n"
			+ "71,47,57,55,73,25,39,44,96\r\n"
			+ "55,19,73,35,79,58,12,84,82\r\n"
			+ "44,47,27,71,73,26,41,99,28,79,19,91,98\r\n"
			+ "93,29,76,17,66,37,27,96,15,28,48,51,55,19,47\r\n"
			+ "84,24,93,53,79,29,64,89,68\r\n"
			+ "65,56,23,68,42,89,81,18,64,93,29,76,17,66,37,27,96,25,44,71,15,57,41\r\n"
			+ "12,93,66,45,29,67,82,17,64,18,81,68,34,27,88,89,56,42,65\r\n"
			+ "47,48,12,82,26,53,97\r\n"
			+ "55,88,19,82,73,84,28,12,35,45,79\r\n"
			+ "84,76,97,23,26,64,17,45,88\r\n"
			+ "65,17,68,71,41,29,42,15,44\r\n"
			+ "76,27,25,44,85,48,51,55,19\r\n"
			+ "93,76,37,27,96,25,71,15,41,91,85,48,51,19,47\r\n"
			+ "58,93,34,24,35,65,45,18,23\r\n"
			+ "19,79,73,82,97,67,47,34,53\r\n"
			+ "37,15,81,57,27,76,85,29,42,91,44,68,93,25,17,28,89,64,18,23,96\r\n"
			+ "65,82,84,68,56,93,45,64,12,67,97,18,17,42,58,88,89,81,23,76,29,66,34\r\n"
			+ "57,48,51,55,47,39,35,24,97,53,45,12,84\r\n"
			+ "96,44,51,98,85,37,48,55,57,39,24,73,28,99,47,79,91,25,15\r\n"
			+ "28,55,98,19,79\r\n"
			+ "68,42,18,64,93,76,66,37,27,25,44,71,15,57,41,91,28,85,48\r\n"
			+ "91,41,51,79,47\r\n"
			+ "24,79,26,53,45,58,12,84,88,34,82,65,67,23,68,42,89,81,64,93,29\r\n"
			+ "71,25,57,41,79,91,15,96,85,28,35,44,55,27,26,47,24\r\n"
			+ "98,39,35,26,82,67,56,23,68\r\n"
			+ "68,42,18,76,17,37,27,71,15\r\n"
			+ "19,47,73,99,39,35,24,79,26,97,53,45,58,12,84,88,34,82,65,67,23,68,42\r\n"
			+ "17,66,37,27,96,25,44,71,57,41,91,28,85,48,51,55,98,19,47,73,99,39,35\r\n"
			+ "53,76,34,93,88,84,26,67,58,97,82,68,79\r\n"
			+ "66,17,15,47,76,48,29,99,51,55,85,25,96\r\n"
			+ "25,93,17,28,19,37,85,27,71,44,41,47,73,48,66,57,51,15,91,98,96,76,29\r\n"
			+ "35,24,79,97,53,45,58,12,84,88,34,82,67,56,23,68,42,64,93\r\n"
			+ "39,35,24,79,26,97,53,45,58,12,88,34,82,65,67,56,68,89,81,18,64\r\n"
			+ "99,26,53,88,65,56,23,68,42,81,18\r\n"
			+ "93,29,76,17,66,37,96,71,57,85,98,47,73\r\n"
			+ "66,37,96,25,44,15,57,28,51,55,98,47,39,35,24\r\n"
			+ "99,39,97,53,12,88,68,81,18\r\n"
			+ "84,34,65,42,93\r\n"
			+ "58,84,88,34,82,65,56,42,89,81,18,29,17,66,37\r\n"
			+ "53,24,89,26,39,47,65\r\n"
			+ "44,25,48,15,76,47,66,96,27,98,91,51,37,71,28,17,73,29,57,85,41,99,55\r\n"
			+ "19,73,99,39,24,26,97,53,45,58,12,88,65,67,42\r\n"
			+ "81,48,44,76,15,57,17,71,28,27,91,96,51,37,85\r\n"
			+ "17,66,41,91,85,48,51,55,47,73,35\r\n";
}