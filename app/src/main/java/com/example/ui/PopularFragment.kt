package com.example.ui

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.data.model.ResourceStatus
@androidEntryPoint
class PopularFragment {
    override fun onViewCreated(view: View,savedInstaceState: Bundle?){
        super.onViewCreated(view,savedInstaceState)

        binding.rvMovies.layoutManager =  LinearLayoutManager(context)

        viewModel.fetchPopularMovies.observe(viewLifecycleDoner,observer{it.Resourse<List<MovieEntity>>
        when (it.resourceStatus.LOADING -> {
            Log.e("fetchPopularMovies", "Loading")
            }
            ResourceStatus.SUCCESS -> {
                Log.e("fetchPopularMovies", "Loading")
                popularMovieItemAdapter = PopularItemAdapter(it.data||,this@PopularFragment)
                binding.rvMovies.adapter = popularMovie
            })
        })
    }
}