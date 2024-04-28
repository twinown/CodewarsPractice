class CodeWars_140 {
   /* Given number A you must return number B so that
    (int) (A + B) == 123
    Note
    B can't be negative*/
    object Dinglemouse {
        fun int123(a: Int): Long {
            return Integer.toUnsignedLong(123 - a)
        }
    }
}