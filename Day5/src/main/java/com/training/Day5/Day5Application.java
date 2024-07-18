package com.training.Day5;

import com.training.Day5.repo.ProfileRepository;
import com.training.Day5.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day5Application implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProfileRepository profileRepository;

    public static void main(String[] args) {
        SpringApplication.run(Day5Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setId(1);
//        user.setName("Raghav");
//
//        Profile profile = new Profile();
//        profile.setId(10);
//        profile.setBio("feeling happy");
//
//        profile.setUser(user);
//        user.setProfile(profile);
//
//        userRepository.save(user);
//
//        User foundUser = userRepository.findById(1).get();
//        System.out.println(foundUser.getProfile().getBio());
//
//        Profile foundProfile = profileRepository.findById(foundUser.getProfile().getId()).get();
//        System.out.println(foundProfile.getUser().getName());

    }
}


//		Post post1 = new Post();
//		post1.setId(1);
//		post1.setContent("post 1 content");
//		post1.setUser(user);
//
//		Post post2 = new Post();
//		post2.setId(2);
//		post2.setContent("post 2 content");
//		post2.setUser(user);
//
//		Post post3 = new Post();
//		post3.setId(3);
//		post3.setContent("post 3 content");
//		post3.setUser(user);
//
//		List<Post> postList = new ArrayList<>();
//		postList.add(post1);
//		postList.add(post2);
//		postList.add(post3);
//
//
//		user.setPostList(postList);
//
//		userRepository.save(user);


