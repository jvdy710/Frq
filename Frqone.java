public int walkDogs(int hour){
        int dogsToWalk = Math.min(maxDogs, company.numAvailableDogs(hour));
        company.updateDogs(hour, dogsToWalk);
        return dogsToWalk;
    }
