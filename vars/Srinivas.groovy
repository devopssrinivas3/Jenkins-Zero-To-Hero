def reverseNumber(int number) {
    def reversed = number.toString().reverse().toInteger()
    return reversed
}

def number = 12345
def reversedNumber = reverseNumber(number)
println "Original number: $number"
println "Reversed number: $reversedNumber"
