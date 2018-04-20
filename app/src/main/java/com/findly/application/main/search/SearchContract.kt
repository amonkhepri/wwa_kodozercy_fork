package com.findly.application.main.recognised

import com.findly.application.base.MvpPresenter
import com.findly.application.base.MvpView

/**
 * Created by Wojdor on 20.04.2018.
 */

interface SearchContract {

    interface View : MvpView

    interface Presenter : MvpPresenter<View>
}