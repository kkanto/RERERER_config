 
listView('RERERER Jobs') {
    description('RERERER Jobs')
    jobs {
        regex('RERERER_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
