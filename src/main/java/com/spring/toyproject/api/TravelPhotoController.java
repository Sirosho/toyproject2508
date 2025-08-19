package com.spring.toyproject.api;


import com.spring.toyproject.domain.dto.common.ApiResponse;
import com.spring.toyproject.service.TravelLogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/photos")
@Slf4j
public class TravelPhotoController {
    private final TravelLogService travelLogService;

    @GetMapping("/{travelLogId}")
    public ResponseEntity<?> getPhotos(
            @AuthenticationPrincipal String username
            , @PathVariable Long travelLogId
    ){

        travelLogService.getPhotos(travelLogId,username);

        return ResponseEntity.ok(ApiResponse.success("",null));
    }
}
