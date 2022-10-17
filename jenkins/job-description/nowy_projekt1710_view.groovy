 
listView('nowy_projekt1710 Jobs') {
    description('nowy_projekt1710 Jobs')
    jobs {
        regex('nowy_projekt1710_.+')
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
