def call() {
  sh 'echo Hi From DevOps Team Srinivas'

  def numbers = [1, 2, 3, 4, 5]
def reversedNumbers = numbers.reverse()

println "Original numbers: $numbers"
println "Reversed numbers: $reversedNumbers"
}
