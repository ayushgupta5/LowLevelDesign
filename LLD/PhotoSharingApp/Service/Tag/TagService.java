package Service.Tag;

import Model.Tag.Tag;

public class TagService implements ITagService {
    @Override
    public void createTag(Tag tag) {
        System.out.println("Creating the Tag : " +tag.toString());
    }

    @Override
    public void deleteTag(Tag tag) {
        System.out.println("Deleting the Tage : " + tag.toString());
    }
}
