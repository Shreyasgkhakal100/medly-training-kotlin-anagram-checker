class AnagramChecker {
    fun match(word1: String, word2: String): Boolean {
        val counter = IntArray(26) { 0 }
        if (word1.length != word2.length) return false
//        var string1 = word1.lowercase()
//        var string2 = word2.lowercase()
        (word1.indices).forEach { index ->
            ++counter[word1.lowercase()[index] - 'a']
            --counter[word2.lowercase()[index] - 'a']
        }
        return !counter.any { it != 0 }
    }
}
