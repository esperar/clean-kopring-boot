package esperer.kopring.domain.auth.service

import esperer.kopring.domain.auth.presentation.data.dto.MemberDto

interface MemberProfileImageService {
    fun execute(userDto: MemberDto)
}