package repository;

import foodsystemanalytictool.About;

/**
 *
 * @author Liyabona Saki
 */
public class aboutImpl implements about{

    private About about;
    
    @Override
    public void aboutSystem() {
        
    }
    
    public void aboutSystem(About about) {
        
        this.about = about;
    }

    public About getAbout() {
        return about;
    }

    
    
}
