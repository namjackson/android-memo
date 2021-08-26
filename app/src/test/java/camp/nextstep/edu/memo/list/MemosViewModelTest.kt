package camp.nextstep.edu.memo.list

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import camp.nextstep.edu.memo.domain.entity.Memo
import camp.nextstep.edu.memo.domain.repository.MemoRepository
import com.google.common.truth.Truth.assertThat
import io.mockk.every
import io.mockk.mockk
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MemosViewModelTest {

    private lateinit var viewModel: MemosViewModel
    private lateinit var memoRepository: MemoRepository

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        memoRepository = mockk()
    }

    @Test
    fun `메모리스트를 정상적으로 받아와야한다`() {
        // given
        val list: List<Memo> = listOf(Memo.newInstance("Test1"), Memo.newInstance("Test2"))
        every { memoRepository.getMemoList() } answers { list }

        // when
        viewModel = MemosViewModel(memoRepository)

        // then
        assertThat(viewModel.memoList.value).isEqualTo(list)
    }
}