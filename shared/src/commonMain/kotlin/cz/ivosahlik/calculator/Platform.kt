package cz.ivosahlik.calculator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform