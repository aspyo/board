package hello.board.domain.post.application;

import hello.board.domain.post.domain.Post;
import hello.board.domain.post.repository.PostRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    // 게시글 생성
    @Transactional
    public Long createPost(Post post) {
        Post saved = postRepository.save(post);
        return saved.getId();
    }

    // 모든 게시글 조회
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    // 특정 게시글 조회
    public Post findPost(Long id) {
        Optional<Post> findPost = postRepository.findById(id);
        return findPost.orElseThrow(() -> new EntityNotFoundException("해당 게시글을 찾을 수 없습니다."));
    }

    // 게시글 삭제
    @Transactional
    public void deletePost(Post post) {
        postRepository.delete(post);
    }
}