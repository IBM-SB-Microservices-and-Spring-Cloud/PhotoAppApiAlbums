package com.photoapp.albums.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoapp.albums.dto.AlbumsDTO;

@RestController
@RequestMapping("/users/{userId}/albums")
public class AlbumsController {

	@GetMapping(path = "/version")
	public String getVersion() {
		return "V1";
	}

	@GetMapping
	public ResponseEntity<List<AlbumsDTO>> getAlbums(@PathVariable("userId") String userId) {
		System.out.println("UID: " + userId);
		if ("a@b.co222m703727053".equals(userId)) {
			AlbumsDTO albumsDTO = new AlbumsDTO(121L, "Sure Kahaf");
			List<AlbumsDTO> albums = new ArrayList<AlbumsDTO>();
			albums.add(albumsDTO);
			return new ResponseEntity<List<AlbumsDTO>>(albums, HttpStatus.OK);
		}
		return new ResponseEntity<List<AlbumsDTO>>(HttpStatus.NOT_FOUND);
	}
}
