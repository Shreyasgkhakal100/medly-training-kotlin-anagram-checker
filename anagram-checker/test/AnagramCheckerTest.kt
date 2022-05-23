import io.kotest.core.spec.style.DescribeSpec
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import javax.print.DocFlavor.STRING

class AnagramCheckerTest : StringSpec() {
    init {
        "should return true if two strings are anagrams with same characters" {
            AnagramChecker().match("a", "a").shouldBeTrue()
        }
        "should return false if two strings are not anagrams with different characters" {
            AnagramChecker().match("a", "b").shouldBeFalse()
        }
        "should return true if two strings are anagrams with same characters but different sequence" {
            AnagramChecker().match("ab", "ba").shouldBeTrue()
        }
        "should return true if strings are anagrams with uppercase characters" {
            AnagramChecker().match("A", "A").shouldBeTrue()
        }
        "should return true if strings are anagrams with mixed case characters" {
            AnagramChecker().match("Ab", "Ba").shouldBeTrue()
        }
        "should return false if strings are not anagrams with mixed case characters" {
            AnagramChecker().match("Ab", "Bb").shouldBeFalse()
        }
        "should return  false if strings are not anagrams with same character but of different length" {
            AnagramChecker().match("a", "aa").shouldBeFalse()
        }
    }
}
