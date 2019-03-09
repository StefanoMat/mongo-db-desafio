package challenge;

import org.springframework.data.mongodb.repository.MongoRepository;

interface RecipeCommentRepository extends MongoRepository<RecipeComment, String> {

}
