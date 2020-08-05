package convertStringToCamelCase

fun transformToCamelCase(str: String): String {
    return str.split("-", "_")
            .mapIndexed { index, it -> if (index == 0) it else it.capitalize() }
            .joinToString("")
}